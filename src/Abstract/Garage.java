package Abstract;

public class Garage {
    private Transport[] transports;

    public Garage(Transport[] transports) {
        this.transports = transports;
    }

    public void addTransportToGarage(Transport transport){
        for (int i = 0; i < transports.length; i++) {
            if (transports[i]==null){
                transports[i]=transport;
                System.out.println("Успешно добавлен в гараж.");
                return;
            }

        }
        System.out.println("Не добавлен в гараж.");
    }
    public void changeTransportPositionInGarage(int before, int after){
        Transport transport = transports[after-1];
        transports[after-1]=transports[before-1];
        transports[before-1]= transport;
    }
    public void showAllTransportOneType(String type){
        int count =1;
        for (Transport transport1 : transports) {
            if ((null != transport1) && (transport1.getTransportType().getType().equals(type))){
                System.out.printf("%d. %s - %s\n", count,transport1.getName(),transport1.getTransportType().getType());
                count++;
            }
        }
        System.out.println();
    }
    public void getGrageList(){
        int count =1;
        for (Transport transport : transports) {
            if(transport!=null) {
                System.out.printf("%d. %s - %s\n", count, transport.getName(), transport.getTransportType().getType());
                count++;
            }
        }
        System.out.println();
    }

}
