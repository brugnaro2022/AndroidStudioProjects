package com.globomantics.loginverification

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val verification = LoginVerification()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun loginSuccessful_whenCorrectCredentials() {
        assertTrue(verification.verify("test@globomantics.com", "test123"))
    }

    @Test
    fun loginSuccessful_whenWrongEmail() {
        assertFalse(verification.verify("test@test.com", "test123"))
    }

    @Test
    fun loginSuccessful_whenWrongPassword() {
        assertFalse(verification.verify("test@test.com", "test1234"))
    }
}