public class Car {
    private String make;
    private int price;

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

    @Override
    public String toString() {
        return make+"("+price+")";
    }

    public int getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }
}
