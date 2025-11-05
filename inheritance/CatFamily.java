package inheritance;

public class CatFamily {
    protected int legs; // Защищенные поля
    protected int eyes;
    protected boolean canEatPerson;
    public CatFamily(int legs, int eyes, boolean canEatPerson) {  // Конструктор класса CatFamily
        this.legs = legs; // Инициализирует все поля объекта
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public void eat() { // Метод eat() - общее поведение для всех кошачьих
        System.out.println("Кушаю");
    }

    // СЕТТЕРЫ (методы для установки значений полей)
    public void setLegs(int legs) {  // создаем сеттер чтобы в наследниках обращаться к классу напрямую
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }

    // ГЕТТЕРЫ (методы для получения значений полей)

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }
}
