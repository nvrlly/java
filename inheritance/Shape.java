package inheritance;

public abstract class Shape { // Нельзя создать экземпляр этого класса напрямую

    // Приватные поля для хранения размеров фигуры
    private int a;
    private int b;

    // Конструктор класса Shape
    public Shape(int a, int b) {
        this.a = a; // Инициализирует поля a и b
        this.b = b;
    }

    public final int getA() { // final означает, что метод нельзя переопределить в дочерних классах
        return a;
    }

    public final int getB() {
        return b;
    }
    public abstract int getPerimeter(); // Абстрактный метод для вычисления периметра

    public final void showPerimeter() {  // Финальный метод для отображения периметра
        System.out.println(getPerimeter());
    }
}
