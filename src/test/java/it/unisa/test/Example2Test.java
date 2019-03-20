package it.unisa.test;

import it.unisa.progetto.Example2;
import org.junit.Test;

/**
 * EagerTest
 */
public class Example2Test {
    @Test
    public void test1() {
        new Example2().doSomething(1);
        new Example2().doSomething(1);
        new Example2().doSomething2(22);
    }

    @Test
    public void test2() {
        new Example2().doSomething(2);
    }

    @Test
    public void test3(){
        new Example2().doSomething(22);
    }

}
