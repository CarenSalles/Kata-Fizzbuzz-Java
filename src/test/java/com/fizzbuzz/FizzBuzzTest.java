package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }

    @Test
    public void test_fizzbuzz_asign_value_number() {
        FizzBuzz myFizz = new FizzBuzz(3);
        assertEquals("fizz", myFizz.fizz());
    }

    @Test
    public void test_fizzbuzz_asign_value_number2() {
        FizzBuzz myBuzz = new FizzBuzz(5);
        assertEquals("buzz", myBuzz.buzz());
    }

    @Test
    public void test_fizzbuzz_asign_value_number3() {

        FizzBuzz myFizzBuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz", myFizzBuzz.fizzBuzz());
    }

    @Test
    public void test_fizzbuzz_asign_value_number4() {
        FizzBuzz myFizzBuzz = new FizzBuzz(39);
        assertEquals("39", myFizzBuzz.fizzBuzz());
    }

    @Test
    public void test_fizzbuzz_with_number() {
        FizzBuzz myFizzBuzz = new FizzBuzz(null);

        String ans = myFizzBuzz.verifyIfIncludeNumber(54);

        assertEquals("Buzz", ans);
    }

    @Test
    public void test_StartMethod_NumberDivibleBy3AndContain3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        String result = fizzBuzz.start();
        assertEquals("Fizz", result);
    }

}
