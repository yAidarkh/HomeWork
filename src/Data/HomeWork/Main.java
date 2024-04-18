package Data.HomeWork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();
        Util util = new Util(friends);
        util.menu();
    }
}
