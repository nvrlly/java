package interfaces;

public class Programmer implements Worker, Driver{ //реализует два интерфейса: Worker и Driver
    @Override
    public void work() { // Реализация метода work() из интерфейса Worker
        System.out.println("Программист работает");
    }

    @Override
    public void drive() {
        System.out.println("Программист водит машину");
    }
}
