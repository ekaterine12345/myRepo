package Task_1;

public class Fraction implements Comparable<Fraction>{
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator <0) {this.numerator*=-1; this.denominator*=-1;}
    }

    @Override
    public String toString() {
        return  numerator + "/" + denominator;
    }

    @Override
    public int compareTo(Fraction o) {

        if (this.numerator / this.denominator > o.numerator/o.denominator) return 1;
        else
        if (this.numerator / this.denominator < o.numerator/o.denominator) return -1;

        return 0;
    }
}
