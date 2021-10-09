/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vuvantu
 */
public class OddThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                   ex.printStackTrace();
                }
            }
        }
    }

}
