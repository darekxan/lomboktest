package com.example.lomboktest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaAccess {

    @Test
    public void accessTest() {
        assertEquals("TEST", new TestModel().getTest());
    }
}
