package ru.netology;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        /*В коде из упражнения в методе devide класса Calculator нет проверки деления на ноль
          Здесь смоделирована ситуация деления на ноль, которая провоцирует арифметик эксепшн
          Чтобы решить проблему нужно либо обработать исключение в методе devide,
          либо через условные операторы исключить вероятность попадания нуля непосредственно в операцию деления
         */

        int c = calc.devide.apply(a, b);

        calc.println.accept(c);



    }
}
