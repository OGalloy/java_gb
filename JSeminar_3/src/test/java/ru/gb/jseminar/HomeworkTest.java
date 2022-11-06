package ru.gb.jseminar;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HomeworkTest extends Homework{
    @Test
    void getMaxSeccessful(){
        //Исходные значения
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(1);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(7);
        int expected = 7;
        int actual = getMax(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinSeccessful(){
        //Исходные значения
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(1);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(7);
        int expected = 1;

        //
        int actual = getMin(expectedList);

        //
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeNegativeValueSeccessful(){
        //data
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(1);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(7);

        List<Integer> validList = new ArrayList<Integer>();
        validList.add(1);
        validList.add(7);

        //
        List<Integer> actualList = removeNegativeValue(expectedList);

        //
        Assertions.assertEquals(actualList, validList);
    }

    @Test
    void getAvarageSeccessfull(){
        //
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(3);
        expectedList.add(4);
        double validValue = 3.5;

        //
        double actualValue = getAverage(expectedList);

        //
        Assertions.assertEquals(validValue, actualValue);
    }
}