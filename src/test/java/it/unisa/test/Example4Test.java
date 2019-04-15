package it.unisa.test;

import it.unisa.progetto.Example4;
import org.junit.Before;
import org.junit.Test;

/**
 * EagerTest e GeneralFixture
 */
public class Example4Test {
    String testString;

    @Before
    public void setUp() throws Exception {
        testString = "test";
    }

    @Test
    public void test1() {
        new Example4().doSomething(1);
        new Example4().doSomething(1);
        new Example4().doSomething2(22);
    }

    @Test
    public void test2() {
        new Example4().doSomething(1);
        new Example4().doSomething(1);
        new Example4().doSomething2(22);
        new Example4().doSomething3(1);
    }

    @Test
    public void test3(){
        new Example4().doSomething(22);
    }

}
