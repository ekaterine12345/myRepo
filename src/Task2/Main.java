package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Product> myProducts = new ArrayList<>();
        myProducts.add(new Product(1, 2));
        myProducts.add(new Product(2, 5555));
        myProducts.add(new Product(3, 12));

        System.out.println(myProducts);

        dataToMap(myProducts);


    }

    public static void dataToMap(List<Product> myList){
        Map<Product, Integer> map = new HashMap<>();
        int sum=0;

        for (Product product : myList){
            sum += product.getQuantity();
        }

        for (Product product : myList){
            map.put(product, sum);
        }

        for (Map.Entry<Product,Integer> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}
