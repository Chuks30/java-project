package tdd;

import jdk.dynalink.linker.ConversionComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {

     Comparison comparison;

    @BeforeEach
    void startAllTestWith(){
       Comparison comparison = new Comparison();

    }



    @Test
    void addThreeIntegers(){
        Comparison comparison = new Comparison();
        //when
       int sum = comparison.addThreeIntegers(2, 3, 5);
        //verify
        assertEquals(10,sum);
    }

    @Test
    void findMinimumOfThreeIntegers(){
        //given
        Comparison minimum = new Comparison();
        //when
        minimum.findminmim(3, 5, 10);
        //verify
        assertEquals(3,minimum.findminmim(3, 5, 10));
    }

    @Test
    void findProductOfThreeIntegers(){
        //given
        Comparison product = new Comparison();
        //when
        product.findProduct(3, 2, 4);
        //verify
        assertEquals(24,product.findProduct(3, 2, 4));
    }

    @Test
    void findMaximumOfThreeIntegers(){
        //given
        Comparison maximum = new Comparison();
        //when
        maximum.findMaximum(3, 5, 10);
        //verify
        assertEquals(10,maximum.findMaximum(3, 5, 10));
    }


    @Test
    void findAverageOfThreeIntegers(){
        //given
        Comparison average = new Comparison();
        //when
        average.findAverage(3, 5, 2);
        //verify
        assertEquals(8,average.findAverage(3, 5, 2));

    }
}