/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anonymous.ddos.main;

import org.anonymous.ddos.thread.*;

/**
 *
 * @author user
 */
public class main {
    public static void main(String args[]) {
        for(int i=0;i<400;i++)
        {
      netthread R1 = new netthread( "Thread-"+i);
      R1.start();
        }
      
   } 
}
