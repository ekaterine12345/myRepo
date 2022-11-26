package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(5.3));
        circleList.add(new Circle(2.7));
        circleList.add(new Circle(5.9));
        circleList.add(new Circle(1.7));


        Collections.sort(circleList);

        System.out.println(circleList);




    }
}
