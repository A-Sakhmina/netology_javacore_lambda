package task1_calculator;

public class Main {
    public static void main(String[] args) {

        //экземпляр класса Calculator через вызов статической переменной instance
        Calculator calc = Calculator.instance.get();

        //несколько математических операций над числами
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        //возникает исключение при делении на 0, исключение обработала - вывод соообщения и возврат 0
        int c = calc.divide.apply(a, b);

        //никакой ошибки с тернарным операторм не возникает,
        // потому не стала оформлять данную операцию в блочную конструкцию
        int d = calc.abs.apply(-7);

        //в консоль результат
        System.out.printf("Результат деления %d/%d: %d", a, b, c);
        calc.println.accept(c);
        System.out.printf("Результат взятия %d под модуль: ", -7);
        calc.println.accept(d);

    }
}
