package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListMapQuestion {
    public static void main(String[] args) {
        ArrayList<String> brand = new ArrayList<>(Arrays.asList("Sony", "LG", "Nokia"));
        ArrayList<String> product = new ArrayList<>(Arrays.asList("Bravia", "Lane", "Lumia"));

        for (String str : product){
            if (str.contains("Bravia")){
                System.out.println(brand.get(0) + " = "  + str);
            }
            else if (str.contains("Lane")){
                System.out.println(brand.get(1) + " = " + str);
            }
            else if (str.contains("Lumia")){
                System.out.println(brand.get(2) + " = " + str);
            }
        }


    }
}
