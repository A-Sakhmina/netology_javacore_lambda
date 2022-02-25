package task2_worker;

public class Main {
    public static void main(String[] args) {

        //определяем переменные через лямбда-выражения,
        //вызов метода функционального интерфейса через ссылку
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener1 = System.out::println;

        Worker worker = new Worker(listener,listener1);
        worker.start();

    }
}
