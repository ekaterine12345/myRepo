package Task_2;

public class Student {
    private int id;
    private double score;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return id+" "+score;
    }

}
