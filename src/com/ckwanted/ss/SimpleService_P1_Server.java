
package com.ckwanted.ss;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2016-05-24T12:24:30.172+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
 
public class SimpleService_P1_Server{

    protected SimpleService_P1_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new P1Impl();
        String address = "http://localhost:8080/ss/p1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new SimpleService_P1_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}