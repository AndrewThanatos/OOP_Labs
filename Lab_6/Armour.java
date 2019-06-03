package Lab_6;

public class Armour extends Equipment{

    public Armour(String id, int price, int defence) {
        super(id, price, defence);
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", price=" + price +
                ", defence=" + usage +
                "\n";
    }
}
