package CarpetOBP;

public class CarpetCompanyMain {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
    static class Calculator {
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {

            return (this.floor.getArea() * this.carpet.getCost());
        }
    }
    static class Carpet {
        private double cost;

        public Carpet(double cost) {
            if (cost < 0.00) {
                this.cost = 0.00;
            } else {
                this.cost = cost;
            }
        }

        public double getCost() {

            return this.cost;
        }
    }
    static class Floor {
        private double width;
        private double length;

        public Floor(double width, double length) {
            if (width < 0.0D) {
                this.width = 0.0D;
            } else {
                this.width = width;
            }

            if (length < 0.0D) {
                this.length = 0.0D;
            } else {
                this.length = length;
            }

        }

        public double getArea() {

            return this.width * this.length;
        }
    }
}
