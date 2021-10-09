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
public class MainClass {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread),
                t2 = new Thread(myThread);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
