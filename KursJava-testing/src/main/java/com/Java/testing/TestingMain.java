package com.Java.testing;

import com.Java.testing.user.SimpleUser;
import com.Java.testing.calculator.Calculator;
import org.w3c.dom.ls.LSOutput;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUserName();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator simpleCalcTest = new Calculator();

        int resultCalc = simpleCalcTest.add(4, 20);

        if (resultCalc == simpleCalcTest.getA() + simpleCalcTest.getB()) {
            System.out.println("Simple add test OK");
        } else {
            System.out.println("Simple add test Error!");
        }

        resultCalc = simpleCalcTest.subtract(4, 20);

        if (resultCalc == simpleCalcTest.getA() - simpleCalcTest.getB()) {
            System.out.println("Simple subtract test OK");
        } else {
            System.out.println("Simple subtract test Error!");
        }

    }


}
