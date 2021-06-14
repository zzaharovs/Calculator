package ru.netology;

import java.sql.SQLOutput;
import java.util.function.*;

public class Calculator {

    static Supplier <Calculator> instance = Calculator::new;

    BinaryOperator <Integer> plus = (x, y) -> x + y;
    BinaryOperator <Integer> minus = (x, y) -> x - y;
    BinaryOperator <Integer> multiply = (x, y) -> x * y;

    //BinaryOperator <Integer> devide = (x, y) -> x / y; //Код провоцирующий эксепшн

    //BinaryOperator <Integer> devide = (x, y) -> y != 0 ? x / y : x; //Код через тернарный оператор

    BinaryOperator <Integer> devide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя! Будет возвращено делимое число");
            //System.exit(1); // Вариант который позволит прервать выполнение программы, не возвращая никакого значения
        }
        return x;
    };

    UnaryOperator <Integer> pow = x -> x * x;
    UnaryOperator <Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate <Integer> isPositive = x -> x > 0;

    Consumer <Integer> println = System.out::println;

}
