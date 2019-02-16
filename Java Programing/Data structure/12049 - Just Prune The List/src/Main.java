
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suvonkar Kundu
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tc=input.nextInt();
        Set<Integer> obset=new LinkedHashSet<Integer>();
        Set<Integer> obset1=new LinkedHashSet<Integer>();
        int n,m;
        for(int J=0;J<tc;J++)
        {
        n=input.nextInt();
        m=input.nextInt();
        for(int i=0;i<n;i++)
        {
        obset.add(input.nextInt());
        }
         for(int i=0;i<m;i++)
        {
        obset1.add(input.nextInt());
        }
         Set<Integer> difference=new LinkedHashSet<Integer>(obset);
         difference.removeAll(obset1);
         int count=difference.size();
         System.out.println(count);
          Set<Integer> difference1=new LinkedHashSet<Integer>(obset1);
           difference.removeAll(obset);
           int count1=difference1.size();
            System.out.println(count1);
           System.out.println(count+count1);
                 
        }
       
    }
    
}
