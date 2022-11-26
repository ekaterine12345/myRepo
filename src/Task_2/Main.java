package Task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 10));
        students.add(new Student(4, 23));
        students.add(new Student(5, 1000));


        System.out.println(students);
       toMap(students);

    }

    public static void toMap(List<Student> myList){
        Map<Student, Double> map=new HashMap();
        double avg=0.0;

        for (Student st : myList){
            avg += st.getScore();
        }

        avg = avg/myList.size();

        for (Student st : myList){
            map.put(st, avg);
        }

        System.out.println(map);
    }

}
