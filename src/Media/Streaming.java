package Media;
import java.util.Random;
public class Streaming {
    Media[] medias;


    public Media getOldestMedia(){
       Media answer = medias[0];
        for (Media m: medias){
            if(m!=null&&m.releaseYear<answer.releaseYear){
                answer=m;
            }
        }
        return answer;
    }
    protected boolean doesArraysHaveObject(){
        boolean hasObjectInArray = false;
        for (Media media : medias) {
            if (media != null) {
                hasObjectInArray = true;
                break;
            }
        }
        return hasObjectInArray;
    }
    public Media getRandom(){
        if (doesArraysHaveObject()){
        Random random = new Random();
        while (true){
            int randomArrayIndex = random.nextInt(medias.length);
            if (medias[randomArrayIndex]!=null){
                return medias[randomArrayIndex];
            }
        }
        }else{
            return null;
        }
    }
    public void addMedia(Media media){
        for (int i = 0; i<medias.length;i++){
            if(medias[i]==null){
                medias[i]=media;
                return;
            }
        }
    }
    public int countMovie(){
        int count = 0;
        for (Media m : medias) {
            if(m!=null&&m instanceof Movie&&!(m instanceof Series)){
                count++;
            }
        }
        return count;
    }

    public int countSeries(){
        int count = 0;
        for (Media m : medias) {
            if(m!=null&&m instanceof Series){
                count++;
            }
        }
        return count;
    }

    private void showMedia(Media media){
        System.out.println("Название: "+media.name);
        System.out.println("Год выпуска: "+media.releaseYear);
    }

    public void showAllMovie(){
        System.out.println("Фильмы: ");
        for (Media m : medias) {
            if(m!=null&&m instanceof Movie&&!(m instanceof Series)){
                showMedia(m);
                System.out.println("\n");
            }
        }
    }
    public void showAllSeries(){
        System.out.println("Фильмы: ");
        for (Media m : medias) {
            if(m!=null&&m instanceof Series){
                showMedia(m);
                System.out.println("\n");
            }
        }
    }
    public void showAllMedia(){
        int count = 1;
        for (Media m : medias) {
            if(m!=null){
                System.out.println("Порядковый номер "+count);
                showMedia(m);
            }
        }
    }

}
