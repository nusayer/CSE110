//Q. Input 5 numbers, find the max



import static java.lang.System.*;
import java.util.*;

public class task1a
{
    public static void main(String[] args)
    {
        int num;
        int max;
        Scanner KB=new Scanner(in);        
        
        out.println("Enter a number");
        num=KB.nextInt();
        max=num;
        
        for(int c=0;c<4;c++)
        {
            out.println("Enter a number");
            num=KB.nextInt();
            
            if(num>max)
            {
                max=num;            
            }
        }
        
        out.println("Max="+max);
    }
}