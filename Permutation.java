import java.util.*;
public class Permutation 
{
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        
        else
        {
            return n*fact(n-1);
        }
        
            
    }
    public static int GetArrangements(String s)
    {
      int n=s.length();//length of string
    
      int f=fact(n); //factorial of string
      
      char ch[]=s.toCharArray();
      
      int output=-1;
      int N=1;
      for(int i=0;i<n;i++)
      {
          char d=ch[i];
          int c=1;
          for(int j=i+1;j<n;j++)
          {
              
              if((ch[j]==d) && (ch[j]!='0'))
              {
                  c++;
                  ch[j]='0';//to avoid to count visited char
                  
              }
              
              
              if(c>1 && (j==(n-1)))// to reach to end of inner for loop so that all same char in string should get count
              {
              
              N=N*fact(c);
              c=0;// to take new count value for each new char within string
              
              }
          }
      }
       
     output=(f/N);
     
     return output; 
      
    }
            
    public static void main(String args[])
    {
        char ch;
        do
        {
        Scanner scan=new Scanner(System.in);
        System.out.println("\nEnter a String:");
        String s=scan.nextLine();
        System.out.println(GetArrangements(s));
        System.out.println("\nDo you want to repeate the process(Y/N)?");
        ch=scan.next().charAt(0);
        }while(ch=='y'||ch=='Y');
      
        
        
    }
            
    
}
