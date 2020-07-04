import java.util.Scanner;

    /**
     * creating Rational class with private data types
     * for use throughout the whole project
     */

    public class Rational {
        private int numerator;
        private int denominator;

        /**
         * Default constructor
         */

        public Rational() { // first constructor initialized
            numerator = 0;
            denominator = 0;
        }

        /**
         * @param n for numerator
         * @param d for denominator
         * Second constructor with parameters
         */

        public Rational(int n, int d) { // second constructor with two arguments initialized
            this.numerator = n;
            this.denominator = d;
        }

        /**
         * Setting the numerator to value
         * @param value
         */

        public void setNumerator(int value) {  // setter for numerator
            numerator = value;
        }

        /**
         * Setting the denominator to value
         * @param value
         */

        public void setDenominator(int value) { // setter for denominator
            denominator = value;
        }

        /**
         * getting the numerator
         * @return numerator
         */

        public int getNumerator() { // getter for numerator
            return numerator;
        }

        /**
         * getting the denominator
         * @return denominator
         */

        public int getDenominator() { // getter for denominator
            return denominator;
        }

        /**
         * getting input from user
         */

        public void inputRational() { // input from the user
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a numerator: ");
            int NumeratorInput = in.nextInt();
            numerator = NumeratorInput;
            System.out.println("Please enter a denominator: ");
            int DenominatorInput = in.nextInt();
            denominator = DenominatorInput;
        }

        /**
         * changing the type of the numerator and denominator to display in the main
         * @return displayNumerator + sign + displayDenominator
         */

        public String toString() {
            // return a string in the form numerator/denominator
            String displayNumerator = Integer.toString(numerator);
            String displayDenominator = Integer.toString(denominator);
            String sign = "/";
            return displayNumerator + sign + displayDenominator;
        }

        /**
         * method for finding the greatest common divisor
         * @param m
         * @param n
         * @return m
         */

        private int gcd(int  m, int n) { // finding the greatest common divisor
            int r;
            while (n != 0) {
                r = m % n;
                m = n;
                n = r;
            }
            return m;
        }

        /**
         * taking in two parameters to add the fractions together
         * then simplified using the gcd method
         * @param r1
         * @param r2
         */

        public void add(Rational r1, Rational r2) {
            // to do
            Rational add = new Rational();
            int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
            int denom = r1.denominator * r2.denominator;
            int gcdVal = gcd(num, denom);
            this.numerator = num/gcdVal;
            this.denominator = denom/gcdVal;
            // 1/2 + 1/3

        }

        /**
         * taking in a parameter to add the fractions together
         * then simplified using the gcd method
         * @param r
         * @return sub
         */

        public Rational subtract(Rational r) {
            Rational sub = new Rational();
            int num = numerator * r.denominator - r.numerator * denominator;
            int denom = denominator * r.denominator;
            int gcdVal = gcd(num, denom);
            sub.numerator = num/gcdVal;
            sub.denominator = denom/gcdVal;
            return sub;
        }

        /**
         * taking in two parameters to multiply the fractions together
         * then simplified using the gcd method
         * @param r1
         * @param r2
         */

        public void multiply(Rational r1, Rational r2) {
            // to do
            Rational mult = new Rational();
            int num = r1.numerator * r2.numerator;
            int denom = r1.denominator * r2.denominator;
            int gcdVal = gcd(num, denom);
            this.numerator = num/gcdVal;
            this.denominator = denom/gcdVal;
            // 1/2 * 1/2
        }

        /**
         * taking in a parameter to divide the fractions together
         * then simplified using the gcd method
         * @param r
         * @return div
         */

        public Rational divide(Rational r){
            Rational div = new Rational();
            int num = numerator * r.denominator;
            int denom = denominator * r.numerator;
            int gcdVal = gcd(num, denom);
            div.numerator = num/gcdVal;
            div.denominator = denom/gcdVal;
            return div;
            // 1/2 / 1/2 -> 1/2 * 2/1
        }

        /**
         * converting the result of division of the fractions to a double
         * @param r1
         * @param r2
         * @return the actual double value after diving the value
         */

        public static double divToDouble(Rational r1, Rational r2) {
            // from the divide function, convert the rational into double
            double num = r1.numerator * r2.denominator;
            double denom = r1.denominator * r2.numerator;
            return num / denom;
            // 1/2 / 1/2 = 1.0
        }
    }

