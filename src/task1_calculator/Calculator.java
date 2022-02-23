package task1_calculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    //математических операций над двумя числами
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {
        try{return x / y;}
        catch (ArithmeticException exception){
            System.out.println("Деление на нуль");
            return 0;
        }
    };

    //математических операций над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //для определения положительное ли число
    Predicate<Integer> isPositive = x -> x > 0;

    //для вывода числа в консоль, для этого ссылку на статический метод println()
    Consumer<Integer> println = System.out::println;

}
