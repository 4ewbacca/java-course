package BillsBurgers;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    public Hamburger(String name,String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }
}
