/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalength.java;

/**
 *
 * @author Suvonkar kundu
 */
public class JavalengthJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={0,1,2,3,4};
        int b[]={10,11,12,13,14};
        a=b;
        b=new int[]{20,21,22,23,24};
        for(int i=0;i<a.length&&i<b.length;i++)
        {     
            System.out.println(a[i]+" "+b[i]);
    }
}
}