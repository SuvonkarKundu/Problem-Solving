/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.charatand.setcharat;


public class StringCharATandSetcharAT {

    
    public static void main(String[] args) {
       
        StringBuffer t=new StringBuffer("HELLO");
        System.out.println("buffer befor="+t);
        System.out.println("charAT(i) before="+t.charAt(1));
        t.setCharAt(1, 'i');
        t.setLength(2);
        System.out.println("buffer after= "+t);
        System.out.println("charAT(1) after="+t.charAt(1));   
    }
}
