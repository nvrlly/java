package example;

public class Array {
    public static void main(String[] args) {
//        String[] names0Months = new String[12];
//        names0Months[0] = "January";
//        names0Months[1] = "February";
//        names0Months[2] = "March";
//        names0Months[3] = "April";
//        names0Months[4] = "May";
//        names0Months[5] = "June";
//        names0Months[6] = "July";
//        names0Months[7] = "August";
//        names0Months[8] = "September";
//        names0Months[9] = "October";
//        names0Months[10] = "November";
//        names0Months[11] = "December";
//        for (int i = 0; i < names0Months.length; i++) {
//            System.out.println(names0Months[i]);
//            if (i < names0Months.length - 1) {
//                System.out.print(", ");
//            } else {
//                System.out.print(".");
//            }
//        }

        int[] numbers = {4, 1, 34, 45, 13, 13};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}