
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class List {
    
    
    
    public static void main(String[] args) {
        ArrayList<String> alist=new ArrayList<String>();
        System.out.println("Inatial size "+alist.size());
        alist.add("A");
        alist.add("B");
        alist.add("C");
        alist.add("D");
        System.out.println("New size "+alist.size());
        System.out.println(alist);
        alist.add(2, "B2");
        System.out.println(alist);
        alist.remove(3);
        alist.remove("D");
        System.out.println("Last content " +alist);
        
    }
  
}
