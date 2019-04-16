/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.test;

import it.unisa.progetto.Example0;

import org.junit.Test;

/**
 * EAGER TEST1
 * @author Rembor
 */
public class Example0Test {

    @Test
    public void test1() {
        new Example0().doSomething(1);
        new Example0().doSomething(1);
        new Example0().doSomething2(22);
    }

    @Test
    public void test2() {
        new Example0().doSomething(2);
    }
    
     @Test
    public void test3(){
        new Example0().doSomething(22);
    }

}
