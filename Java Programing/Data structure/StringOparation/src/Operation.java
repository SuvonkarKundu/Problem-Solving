/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class Operation {
    public static void main (String[]args)
    {
    String x="CuetCse11";
    String y=new String("CuetEEE11");
    String z="CUETCSE11";
      // System.out.println(x.substring(2));
        //System.out.println(x.substring(2, 5));
      /* if(x.regionMatches(1, y, 1, 3))
       {
       
       System.out.println("uet");
       
       }*/
       boolean con=x.regionMatches(true, 1, z, 1, 3);
        System.out.println(con);
    
    
    }

  
}
