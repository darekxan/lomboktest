package com.example.lomboktest

import org.junit.Test

import org.junit.Assert.*


class KotlinAccess {

    @Test
    fun accessTest() {
        assertEquals("TEST", TestModel().getTest())
    }
}
