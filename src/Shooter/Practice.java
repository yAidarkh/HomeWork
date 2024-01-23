package Shooter;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        while (true) {
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти, -2 чтобы сменить расположение оружия%n",
                    player.getSlotsCount()
            );
            player.getListOfWeapons();
            System.out.print("Введите номер: ");
            int slot = scanner.nextInt();
            if (slot >= 1 && slot <= player.getSlotsCount()) {
                player.shotWithWeapon(slot);
            } else if (slot == -1) {
                System.out.println("Game over!");
                return;
            }else if(slot == -2){
                System.out.println("Введите номер оружия которое хотите переставить: ");
                int slotOfWeapon = scanner.nextInt();
                System.out.println("Введите номер слота куда хотите перенести оружие : ");
                int newSlotOfWeapon = scanner.nextInt();
                if(player.changePositionOfWeapon(slotOfWeapon-1,newSlotOfWeapon-1)){
                    System.out.println("Успешно.");
                }else{
                    System.out.println("Неравильно набранный номера.");
                }
            }else{
                System.out.println("Неверное число.");
            }
        }
    }
}
