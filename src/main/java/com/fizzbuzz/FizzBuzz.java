package com.fizzbuzz;

public class FizzBuzz {

    private Integer number;
    private Integer TestNumber = 0;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    public Integer getTestNumber() {
        return TestNumber;
    }

    public void setTestNumber(Integer testNumber) {
        TestNumber = testNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String fizz() {
        if (this.number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(this.number);
    }

    public String buzz() {
        if (this.number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(this.number);
    }

    public String fizzBuzz() {
        if (this.number % 3 == 0 && this.number % 5 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(this.number);
    }

    public static void main(String[] args) {
        int number;
        System.out.println("Secuencia de numeros:");
        System.out.println("Del 0 al 100");
        System.out.println("Serie:");

        for (number = 1; number <= 100; number++) {
            if (number % 3 == 0 && number % 5 == 0)
                System.out.println("FizzBuzz");
            if (number % 3 == 0)
                System.out.println("Fizz");
            if (number % 5 == 0)
                System.out.println("Buzz");
            System.out.println(number + ",");

        }
    }

    public String verifyIfIncludeNumber(Integer testNumber) {
        String numberChoosed = Integer.toString(testNumber);

        if (numberChoosed.contains("3"))
            return "Fizz";

        if (numberChoosed.contains("5"))
            return "Buzz";

        return numberChoosed;

    }

    public String start() {
        this.fizz();
        this.buzz();

        return null;
    }
}
