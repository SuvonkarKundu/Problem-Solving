/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Suvonkar Kundu
 */
public class StringTest {
    public static void main(String[] args) throws IOException {
         BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
         String t="";
         t=input.readLine();
         for(int i=0;i<t.length();i++)
         {
            System.out.println(t.charAt(i));
         
         
         }
         
    }
}
