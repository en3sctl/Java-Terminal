package CarpetOBP;
/*The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. 
To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. 
For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.*/
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
