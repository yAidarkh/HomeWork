package Collections.expample_1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(92.3);
        temperatures.add(12.4);
        temperatures.add(74.1);
        temperatures.add(45.0);

        Double max = 0.0;
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > max) {
                max = temperatures.get(i);
            }
        }
        System.out.printf("Саммая высокая темература: %s C\n", max);
    }
}
