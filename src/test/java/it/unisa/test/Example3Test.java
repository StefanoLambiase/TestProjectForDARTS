package it.unisa.test;

import it.unisa.progetto.Example3;
import org.junit.Test;

/**
 * EagerTest
 */
public class Example3Test {
    @Test
    public void test1() {
        new Example3().doSomething(1);
        new Example3().doSomething(1);
        new Example3().doSomething2(22);
    }

    @Test
    public void test2() {
        new Example3().doSomething(2);
    }

    @Test
    public void test3(){
        new Example3().doSomething(22);
    }

}
