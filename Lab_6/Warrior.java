package Lab_6;

import java.util.ArrayList;
import java.util.Collections;


class Warrior {
    private ArrayList<Equipment> equipment;
    private int totalArmour;
    private int totalWeapon;

    Warrior(ArrayList<Equipment> equipment) {
        this.equipment = equipment;
        this.equipmentLevel();
    }

    public ArrayList<Equipment> getEquipment() {
        return this.equipment;
    }

    public void add(Equipment item) {
        this.getEquipment().add(item);
        this.equipmentLevel();
    }

    private void equipmentLevel() {
        int totalArmour = 0;
        int totalWeapon = 0;
        for (Equipment item : this.getEquipment()) {
            if (item instanceof Armour)
                totalArmour += item.usage;
            else
                totalWeapon += item.usage;
        }
        this.setTotalArmour(totalArmour);
        this.setTotalWeapon(totalWeapon);
    }

    private void setTotalArmour(int totalArmour) {
        this.totalArmour = totalArmour;
    }

    public void equipmentSort(){
        Collections.sort(equipment, Equipment::compareTo);
    }

    private void setTotalWeapon(int totalWeapon) {
        this.totalWeapon = totalWeapon;
    }

    public int getTotalWeapon() {
        return totalWeapon;
    }

    public int getTotalArmour() {
        return totalArmour;
    }

    public void delete(String name) {
        int index = 0;
        for (Equipment item : this.getEquipment()) {
            if (item.name.equals(name)) {
                this.getEquipment().remove(index);
            }
            index++;
        }
        this.equipmentLevel();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Equipment item : equipment)
            s.append(item.toString());
        return s.toString();
    }
}

