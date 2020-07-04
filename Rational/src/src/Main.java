public class Main {
    public static void main(String[] args) {
        Rational R1 = new Rational();
        Rational R2 = new Rational();
        Rational R3 = new Rational();

        R1.inputRational();
        R2.inputRational();

        R3.add(R1, R2);
        System.out.println(R1 + " + " + R2 + " = " + R3);

        R3 = R1.subtract(R2);
        System.out.println(R1 + " - " + R2 + " = " + R3);

        R3.multiply(R1, R2);
        System.out.println(R1 + " * " + R2 + " = " + R3);

        R3 = R1.divide(R2);
        System.out.println(R1 + " / " + R2 + " = " + R3);

        System.out.println("Real Value of Divide: " + R3.divToDouble(R1, R2));


        R1.setNumerator(2);
        R2.setDenominator(5);

        System.out.println("Numerator: " + R1.getNumerator());
        System.out.println("Denominator: " + R2.getDenominator());

    }
}
