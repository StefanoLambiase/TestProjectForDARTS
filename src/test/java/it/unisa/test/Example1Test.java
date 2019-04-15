package it.unisa.test;

import it.unisa.progetto.Example0;
import it.unisa.progetto.Example1;
import it.unisa.progetto.Example3;
import it.unisa.progetto.Example4;
import org.junit.Before;
import org.junit.Test;

/**
 * GENERAL FIXTURE
 */
public class Example1Test {
    private Example1 example1;
    private Example1 example2;
    private Example0 example0;
    private Example3 example3;
    private Example4 example4;

    private String testString;
    private String testString1;
    private String testString2;

    @Before
    public void setUp() throws Exception {
        testString = "test";
        testString2 = "test";

        example1 = new Example1();
        example0 = new Example0();
        example4 = new Example4();
    }

    @Test
    public void doSomething1() {
    }
}