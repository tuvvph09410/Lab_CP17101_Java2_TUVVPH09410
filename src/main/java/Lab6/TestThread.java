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
public class TestThread {

    public static void main(String[] args) {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();

        try {
            oddThread.start();
            oddThread.join();
            evenThread.start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
