// package test;

// import example.MyMath;
// import example.Person;

// import java.util.ArrayList;

// public class Main {
//    public static void main(String[] args) {
//        box.Box box1 = new box.Box(10,10,10);
//        box.Box box2 = new box.Box(20,20,20);
//        box1.showVolume();
//        box2.showVolume();
//        example.Person john = new example.Person();
//        example.Person nick = new example.Person();
//        example.Person max = new example.Person();
//        john.name = "John";
//        john.age = 17;
//        john.weight = 70;
//        nick.name = "Nick";
//        nick.age = 27;
//        nick.weight = 80;
//        max.name = "Max";
//        max.age = 35;
//        max.weight = 60;
//        double sum = john.age + nick.age + max.age;
//        double average = sum / 3;
//        System.out.println(average);
//        example.Dog dog = new example.Dog();
//        dog.name = "Тузик";
//        dog.breed = "Такса";
//        dog.weight = 4;
//        dog.speed = 10;
//        dog.run();
//        example.Test test = new example.Test();
//        System.out.println(test.square(20));
//        example.Rectangle rectangle = new example.Rectangle();
//        rectangle.setDimens(10, 5);
//        System.out.println(rectangle.getArea());
//        example.Employee employee = new example.Employee("John", "director", 100_000);
//        employee.showInfo();
//        System.out.println(example.MyMath.multiple(10));
//        System.out.println(Math.sqrt(36));
//        box.Box box = new box.Box(30);
//        box.showVolume();
//        example.Monster monster = new example.Monster(5);
//        monster.voice(10, "Aaaaa...");
//        box.Box current  = new box.Box(10);
//        box.Box another = current.increase();
//        another.setDimens(20, 20, 20);
//        int result = current.compare(another);
//        System.out.println(result);
//        current.showVolume();
//        another.showVolume();
//        Person person = new Person("John", 25);
//        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
//        System.out.println(MyMath.length(10));
//        System.out.println(MyMath.area(20));
//        System.out.println(MyMath.sum(2,4,2,4));
//        MyArrayList employees = getEmployees();
//        employees.add("James");
//        employees.remove("Emma");
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }
//    }
//    private static MyArrayList getEmployees() {
//        MyArrayList employees = new MyArrayList();
//        employees.add("John");
//        employees.add("Olivia");
//        employees.add("Emma");
//        employees.add("Max");
//        employees.add("Nick");
//        return employees;

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            numbers.add(i);
//        }
//        ArrayList<String> names = getEmployees();
//        ArrayList<String> result = new ArrayList<>();
//        for (int i = 0; i < names.size(); i++) {
//            result.add(numbers.get(i) + " - " + names.get(i));
//        }
//        for (String s : result) {
//            System.out.println(s);
//        }
//    }
//    private static ArrayList<String> getEmployees() {
//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("John");
//        employees.add("Olivia");
//        employees.add("Emma");
//        employees.add("Max");
//        employees.add("Nick");
//        return employees;

//        String s = "This is John. He is 27 years old.";
//        String name = s.substring(8, 12);
//        String ageString = s.substring(20, 22);
//        int age = Integer.parseInt(ageString);
//        examples.Person person = new examples.Person(name, age);
//        System.out.println(person.getName() + " " + person.getAge());
       }
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();
//    }
//        ColoredRect rect = new ColoredRect(10, 20); // Создание объекта
//        Triangle triangle = new Triangle(10, 10, 10);
//        rect.showPerimeter(); // Этот метод унаследован от класса Shape и выводит периметр
//        triangle.showPerimeter();
    }
}
//    public static void main(String[] args) {
//        Cat cat = new Cat(); // Создание объектов различных животных
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//        ArrayList<AbleToRun> animals = new ArrayList<>(); // Создание списка объектов, реализующих интерфейс AbleToRun
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        for (AbleToRun animal : animals) { // Вызов метода run() для всех объектов в списке
//            animal.run();
//        }
//        AbleToFly ableToFly = new Bird(); // Создание ссылки на Bird через интерфейс AbleToFly
//        ableToFly.fly();
//        ArrayList<Animal> animals = new ArrayList<>(); // Создание списка всех животных
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//        for (Animal animal : animals) { // Вызов метода eat() для всех животных
//            animal.eat();
//        }
//        Director director = new Director(); // Создание объектов работников
//        Programmer programmer = new Programmer();
//        Chef chef = new Chef();
//
//        ArrayList<Worker> workers = new ArrayList<>(); // Создание списка работников
//        workers.add(director);
//        workers.add(programmer);
//        workers.add(chef);
//        for (Worker worker : workers) { // Вызов метода work() для всех работников
//            worker.work();
//        }
//
//        ArrayList<Driver> drivers = new ArrayList<>(); // Создание списка водителей
//        drivers.add(programmer);
//        drivers.add(chef);
//        for (Driver driver : drivers) {
//            driver.drive(); // Вызов метода drive() для всех водителей
//        }
//
//        Director director = new Director(); // Создание объекта директора
//        director.force(new Worker() { // Вызов метода force с анонимным классом
//            @Override
//            public void work() {
//                System.out.println("Работаю");
//            }
//        });

//        Client client = new Client();
//        client.makeOrder(new Waiter() {
//            @Override
//            public void bringOrder(String dish) {
//                System.out.println("Я вам принес: " + dish);
            }
        }, "Пицца");
//        public static void main(String[] args) {
//            int a = 0;
//            try { // Начало блока try для обработки исключений
//                int b = 7 / a;
//                int c = Integer.parseInt("asffsadfd"); // Эта строка не выполнится, так как исключение уже произошло выше
//            } catch (ArithmeticException e1) {
//                System.out.println("Делить на ноль нельзя");
//            } catch (Exception e) { // Универсальный обработчик для всех остальных исключений
//                System.out.println("Поймано исключение" + e.getClass());
//            }
//            System.out.println("Hello");
//
//            int[] numbers = new int[10]; // Объявление и инициализация массива целых чисел размером 10 элементов
//            try { // Блок try-catch для обработки возможных исключений
//                System.out.println(numbers[10]);
//            } catch (Exception e) {
//                System.out.println("Вы вышли за пределы массива");
//            }
        }
////import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
////        Person person = new Person("John", 17);
////        System.out.println(person);
//          Random random = new Random();
//          for (int i = 0; i < 100; i++) {
//          int number = random.nextInt(1, 7);
//              String result = String.format("Ваше число %s", number);
//              System.out.println(result);
//              int a = random.nextInt(5, 11);
//              System.out.print(a + " ");
//          }
//    }
//}
    }
}



