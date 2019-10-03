public class Calcualtions {

    int number;
    int number2;
    int number3;
    int number4;
    boolean isEven;
    boolean Odd;

    int circleField(int number) {
        double circleField = (number * Math.PI * number);
        return (int) circleField;
    }

    int power(int number2) {
        int power = number2 * number2;
        return power;
    }

    boolean isEven(int number3) {
        boolean isEven = number3 % 2 != 0;
        return isEven;
    }
    boolean isOdd(int number4) {
        boolean isOdd = number4 % 2 == 0;
        return isOdd;
    }




}