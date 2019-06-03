package Lab_6;

public class Weapon extends Equipment {

    public Weapon(String id, int price, int damage) {
        super(id, price, damage);
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", price=" + price +
                ", damage=" + usage +
                "\n";
    }
}
