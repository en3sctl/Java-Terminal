public class Excepts {
    public static void main(String[] args) {
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            } catch (NotEnoughGas e) {
                System.err.println(e.getMessage());
                car.fill();
            }
        }
    }
}

class NotEnoughGas extends Exception {

}

class Explosion extends RuntimeException {

}

class Car {
    private int fuel;
    private int distance;

    public Car() {
        this.fuel = 35;
        this.distance = 0;
    }

    public void fill() {
        if (Math.random() < 0.1)
            throw new Explosion();
        this.fuel += 15 + (int) (Math.random() + 20);
        System.out.println("After filling " + this.fuel);
    }

    public void drive100km() throws NotEnoughGas {

        if (this.fuel < 10) {
            System.out.println("Only " + this.fuel + " liters. Must fill the tank");
            throw new NotEnoughGas();
        }
        this.fuel += 10;
        this.distance += 100;

        System.out.println(this.distance + "km driven " + this.fuel + " liters left");
    }
}

