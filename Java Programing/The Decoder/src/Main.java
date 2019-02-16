
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
      String str;
      int count=0;
      String str1="1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5";
      String str2="1PIT'pz'h'{yhklthyr'vm'{ol'Pu{lyuh{pvuhs'I|zpulzz'Thjopul'Jvywvyh{pvu5";
      String str3="1KLJ'pz'{ol'{yhklthyr'vm'{ol'Kpnp{hs'Lx|pwtlu{'Jvywvyh{pvu5";

      Scanner input=new Scanner(System.in);
      while(input.hasNextLine())
      {
         
        str=input.nextLine();
        count++;
        if(count==3)
        {
            break;
        }
        if(str.compareTo(str1)==0)
        {
           System.out.println("*CDC is the trademark of the Control Data Corporation.");
        }
        if(str.compareTo(str2)==0)
        {
        
          System.out.println("*IBM is a trademark of the International Business Machine Corporation.");
        
        }
        if(str.compareTo(str3)==0)
        {
           System.out.println("*DEC is the trademark of the Digital Equipment Corporation.");
        }
      }
    }
    
}
