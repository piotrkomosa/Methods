public class Test {
    public static void main(String[] args) {
        Calcualtions mathCalc = new Calcualtions();
        int area = mathCalc.circleField(4);
        System.out.println("Pole powierzchni koła o promieniu 4 to " + area);
        Calcualtions mathCalc2 = new Calcualtions();
        int power = mathCalc2.power(5);
        System.out.println(5 + " podniesiona do kwadratu to " + power);
    }
}
