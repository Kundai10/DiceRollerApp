package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number() {
        var randomNumber = (1..6).random()
        assertTrue("The number was not between 1 and 6", randomNumber in 1..6)
    }
}