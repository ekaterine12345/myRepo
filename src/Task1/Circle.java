package Task1;

public class Circle implements Comparable<Circle>{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "radius "+ radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.Area() - o.Area() >0) return 1;
        else
        if (this.Area() - o.Area() <0) return -1;
        return 0;
    }
}
