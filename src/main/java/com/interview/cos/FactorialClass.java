package com.interview.cos;

import java.math.BigInteger;

public class FactorialClass {
    public FactorialClass() {}

    public BigInteger calculateFactorial(int number) {
        if(number == 0)
            return BigInteger.valueOf(0);

        if(number == 1)
            return BigInteger.valueOf(1);

        BigInteger factorial = BigInteger.valueOf(1);
        int index = 2;
        while(index <= number) {
            factorial = factorial.multiply(BigInteger.valueOf(index));

            if(index % 3 == 0 && index % 5 != 0)
                System.out.println("hokey");
            else if(index % 3 != 0 && index % 5 == 0)
                System.out.println("pokey");
            else if(index % 3 == 0 && index % 5 == 0)
                System.out.println("hokey-pokey");
            
            index++;
        }

        return factorial;
    }
}
