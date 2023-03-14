package CarpetCalculator;

public class Carpet {
        public double cost;




    public Carpet(double cost) {
            this.cost = cost;
            if (cost < 0) {
                cost = 0;
            }
        }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }


}


