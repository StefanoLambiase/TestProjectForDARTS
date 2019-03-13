/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.test;

import it.unisa.progetto.Example1;
import org.junit.Test;

/**
 *
 * @author Rembor
 */
public class Example1Test{
    @Test
    public void test1() {
        new Example1().doSomething(1);
    }

    @Test
    public void test2() {
        new Example1().doSomething(2);
        int a = 4;
        assert(a > 2);
    }
    
     @Test
    public void test3(){
        new Example1().doSomething(22);
    }

}
