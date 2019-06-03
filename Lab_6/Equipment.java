package Lab_6;

import java.util.Objects;

abstract class Equipment implements Comparable<Equipment> {
    protected String name;
    protected int price;
    protected int usage;

    protected Equipment(String name, int price, int usage) {
        this.name = name;
        this.price = price;
        this.usage = usage;
    }



    public int compareTo(Equipment o){
        return Integer.compare(price, o.price);
    }
}
