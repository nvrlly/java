package inheritance;

public class Triangle extends Shape{

    private int c;

    public Triangle(int a, int b, int c) { // Конструктор класса Triangle
        super(a, b); // Вызов конструктора родительского класса Shape
        this.c = c; // Инициализация собственного поля c третьей стороной
    }

    @Override // Переопределение абстрактного метода getPerimeter() из класса Shape
    public int getPerimeter() {
        return getA() + getB() + c; // Используем геттеры из родительского класса для получения сторон a и b
    }
}
