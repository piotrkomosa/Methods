public class Test {
    public static void main(String[] args) {
        Calcualtions mathCalc = new Calcualtions();
        int area = mathCalc.circleField(7);
        System.out.println("Pole powierzchni koła o promieniu"+ 7 + area);
        int power = mathCalc.power(7);
        System.out.println(7 + " podniesiona do kwadratu to " + power);
        boolean isEven = mathCalc.isEven(7);
        System.out.println("liczba " + 7 + " jest " + isEven);
        boolean isOdd = mathCalc.isOdd(7);
        System.out.println("liczba " + 7 + " jest " + isOdd);
    }
}
