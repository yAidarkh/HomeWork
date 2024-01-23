package Shooter;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                new Pistol(),
                new Automate(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }
    public void getListOfWeapons(){
        int count=1;
        for (Weapon w: weaponSlots){
            System.out.format("%d это %s\n",count,w.getName());
            count++;
        }
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot-1];
        // Огонь!
        weapon.shot();
    }
    public boolean changePositionOfWeapon(int indexBefore, int indexAfter){
        if(indexBefore>=0&&indexBefore<=weaponSlots.length&&indexAfter>=0&&indexAfter<= weaponSlots.length){
            Weapon weaponChange = weaponSlots[indexAfter];
            weaponSlots[indexAfter]=weaponSlots[indexBefore];
            weaponSlots[indexBefore] = weaponChange;
            return true;
        }
        return false;
    }
}

