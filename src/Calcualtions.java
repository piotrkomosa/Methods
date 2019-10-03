public class Calcualtions {
    int circleField(int number) {
        double circleField = (number * Math.PI * number);
        return (int) circleField;
    }
    int power(int number) {
        int power = number * number;
        return power;
    }
    boolean isEven(int number) {
        boolean isEven = number % 2 == 0;
        return isEven;
    }
    boolean isOdd(int number) {
        boolean isOdd = number % 2 != 0;
        return isOdd;
    }
}