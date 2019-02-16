/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package therad1;

/**
 *
 * @author Suvonkar kundu
 */
public class Therad1{
    
    public static void main(String[] args) {
       Runnable r1 = new Runnable() {
  public void run() {
    try {
      while (true) {
        System.out.println("Hello, world!");
        Thread.sleep(1000L);
      }
    } catch (InterruptedException iex) {}
  }
};
Runnable r2 = new Runnable() {
  public void run() {
    try {
      while (true) {
        System.out.println("Goodbye, " +
		"cruel world!");
        Thread.sleep(2000L);
      }
    } catch (InterruptedException iex) {}
  }
};

    }
}
