package it.unisa.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Example1Test {
    private String testString;
    private String testString1;

    @Before
    public void setUp() throws Exception {
        testString = "miaow";
    }

    @Test
    public void doSomething1() {
        System.out.println(testString);
    }
}