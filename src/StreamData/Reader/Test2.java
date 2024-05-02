package StreamData.Reader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        List<Country> countries = new ArrayList<>();
        Reader reader = new FileReader("src/StreamData/Reader/recources/country.csv");
        BufferedReader br = new BufferedReader(reader);
        br.readLine();
        while (br.ready()){
            String line = br.readLine();
            if (line.contains("\"")){
                String[] temp = splitQ(line);
                countries.add(getCountry(temp));
            }else {
                String[] temp = line.split(",");
                countries.add(getCountry(temp));
            }

        }
        List<Country> europeCountries = countries.stream().filter(country -> country.continent.equals("Europe")).toList();
        for (Country europeCountry : europeCountries) {
            System.out.println(europeCountry);
        }
        reader.close();

    }
    record Country(String code, String name, String continent, String region, Double surfaceArea, Integer indepYear, Integer population, Double lifeExpectancy, Double gnp, Double gnpOld, String localName, String govermentForm, String headOfState, String capital) {
        @Override
        public String toString() {
            return "Name: %s\nContinent: %s".formatted(name,continent);
        }
    }
    static Country getCountry(String[] temp){
        String code = temp[0];
        String name = temp[1];
        String continent = temp[2];
        String region = temp[3];
        Double surfaceArea = temp[4].equals("null")? null : Double.parseDouble(temp[4]);
        Integer indepYear = temp[5].equals("null")? null : Integer.parseInt(temp[5]);
        Integer population = temp[6].equals("null")? null : Integer.parseInt(temp[6]);
        Double lifeExpectancy = temp[7].equals("null")? null : Double.parseDouble(temp[7]);
        Double gnp = temp[8].equals("null")? null : Double.parseDouble(temp[8]);
        Double gnpOld = temp[9].equals("null")? null : Double.parseDouble(temp[9]);
        String localName = temp[10];
        String govermentForm = temp[11];
        String headOfState = temp[12];
        String capital = temp[13];
        Country country = new Country(code,name,continent,region,surfaceArea,indepYear,population,lifeExpectancy,gnp,gnpOld,localName,govermentForm,headOfState,capital);
        return country;
    }
    static String[] splitQ(String s){
        List<String> list = Arrays.asList(s.split(","));
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).contains("\"")){
               String temp = list.get(i) + ", " + list.get(i+1);
               answer.add(temp);
               i++;
            }else {
                answer.add(list.get(i));
            }
        }
        return answer.toArray(new String[answer.size()]);
    }

}
