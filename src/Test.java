public class Test {
    public static void main(String[] args) {
        Calcualtions mathCalc = new Calcualtions();
        int area = mathCalc.circleField(4);
        int number = 4;
        System.out.println("Pole powierzchni koła o promieniu" + number +" to "+ area);

        Calcualtions mathCalc2 = new Calcualtions();
        int power = mathCalc2.power(7);
        int number2=7;
        System.out.println(number2 + " podniesiona do kwadratu to " + power);

        Calcualtions mathCalc3 = new Calcualtions();
        boolean isEven = mathCalc3.isEven(7);
        int number3=9;
        System.out.println("liczba " + number3 + " jest " + isEven);

        Calcualtions mathCalc4 = new Calcualtions();
        boolean isOdd = mathCalc4.isOdd(7);
        int number4 =6;
        System.out.println("liczba " + number4+ " jest " + isOdd);
    }
}
