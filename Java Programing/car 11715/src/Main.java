
import java.util.Scanner;

public class Main {
    
 public static void main(String args[])
 {
    int tc,i;
       Scanner input=new Scanner(System.in);
    tc=input.nextInt();
    for( i=1;i<=tc;i++)
    {
      double u,v,t,a,s,h;
            u=input.nextInt();
            v=input.nextInt();
            t=input.nextInt();
            a=input.nextInt();
            s=input.nextInt();
            s=((u+v)/2)*t;
          a=(v-u)/t;
          s=((v*v)-u)/(2*a);
          t=(v-u)/a;
          h=(2*(s-(u*t)))/a;
          t=Math.sqrt(h);
          v=Math.sqrt(u+2*a*s);
            u=(v*v)-2*a*s;
            t=(2*s)/(u+v);
    
    System.out.println("Case "+i+": "+(String.format("%.03f",s))+" "+(String.format("%.03f",a)));
    

    
    }
    
    

 }

}
