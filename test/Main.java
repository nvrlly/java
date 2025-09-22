package test;

import example.MyMath;
import example.Person;

public class Main {
    public static void main(String[] args) {
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
        MyArrayList employees = getEmployees();
        employees.add("James");
        employees.remove("Emma");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}