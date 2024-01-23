package weather;

public class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year;
    boolean isRainyMonth;

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }
    public boolean isRainyMonth(String[] weather){
        int count = 0;
        for (String w:weather){
            if(w!=null&&w.equals("Дождь")){
                count++;
            }
        }if (count>15){
            return true;
        }
        return false;
    }
}
