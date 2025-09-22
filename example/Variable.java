package example;

public class Variable {
    public static void main(String[] args) {
        int days = 10000;
        int years = days / 365;
        int months = (days - (years * 365)) / 30;
        int leftDays = days - (years * 365) - (months * 30);
        System.out.println(years);
        System.out.println(months);
        System.out.println(leftDays);
    }
}