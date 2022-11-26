package Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(20, 10));
        fractions.add(new Fraction(21, 5));
        fractions.add(new Fraction(20, 5));
        fractions.add(new Fraction(2, 3));
        fractions.add(new Fraction(5, 7));
        fractions.add(new Fraction(5, 10));

        Collections.sort(fractions);
        System.out.println(fractions);
    }
}