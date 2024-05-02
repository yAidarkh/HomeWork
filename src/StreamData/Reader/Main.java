package StreamData.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("ws");
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(reader);
        while (br.ready()){
            String temp = br.readLine();
            if (map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else {
                map.put(temp, 1);
            }
        }
        reader.close();
        toStringMap(map);
    }
    static void toStringMap(HashMap<String,Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
