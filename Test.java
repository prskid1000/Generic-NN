
import java.io.*;public class Test  
{
    public static void main(String args[])throws Exception
    {    
        crtx v=new crtx(2,10,3,0.2,0.5);
                v.adpt(4);  
               double n[]={0,0};           
            
        System.out.println("ans"+v.ff(n)[0]+" "+v.ff(n)[1]);
               double n1[]={1,0};
               
        System.out.println("ans"+v.ff(n1)[0]+" "+v.ff(n1)[1]);
               double n3[]={0,1};
             
        System.out.println("ans"+v.ff(n3)[0]+" "+v.ff(n3)[1]);
              double  n2[]={1,1};
            
        System.out.println("ans"+v.ff(n2)[0]+" "+v.ff(n2)[1]);
               
               
           
           
       
       
   
    }
}
