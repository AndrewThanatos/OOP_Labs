package Lab_6;

import java.util.ArrayList;

public class Main {

    public static void main(String[]args){
        ArrayList<Equipment> equipment = new ArrayList<>();

        Weapon dawnbreaker = new Weapon("Dawnbreaker", 740, 240);
        equipment.add(dawnbreaker);
        Weapon bladeofWoe = new Weapon("Blade of Woe", 515, 110);
        equipment.add(bladeofWoe);

        Armour helmet = new Armour("Helmet", 300, 100);
        equipment.add(helmet);
        Armour torso = new Armour("Torso", 1040, 190);
        equipment.add(torso);
        Armour legs = new Armour("Legs", 440, 80);
        equipment.add(legs);

        Warrior warrior = new Warrior(equipment);

        warrior.delete("Torso");
        warrior.add(new Armour("Myghty helmet",1500,250));

        System.out.println("Total armour = " + warrior.getTotalArmour());
        System.out.println("Total weapon = " + warrior.getTotalWeapon());

        System.out.println(warrior);

        warrior.equipmentSort();

        System.out.println(warrior);


    }
}