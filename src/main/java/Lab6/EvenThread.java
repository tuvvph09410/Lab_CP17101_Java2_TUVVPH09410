/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author vuvantu
 */
public class EvenThread extends Thread{

    @Override
    public void run() {
         for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException ex) {
                   ex.printStackTrace();
                }
            }
        }
    }
    
}
