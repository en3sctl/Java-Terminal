public class Taskz11_3 {
    public static void main (String[] args) {
        Person john = new Person("John");
        john.buys("Ford", 20000)
                .buys("Opel", 16000)
                .buys("Fiat", 12000)
                .showCars();
        System.out.println();

        john.showCarsRev();
        System.out.println();

        System.out.println("Total price of " +
                john.getName() + "'s cars: " +
                john.getTotalPrice());
        System.out.println("Does " + john.getName() +
                " have a ford? " + john.hasCar("ford"));
        System.out.println("Does " + john.getName() +
                " have a bmw? " + john.hasCar("bmw"));
        System.out.println(john.getName() + "'s most " +
                "expensive car is " + john.mostExpensive());
    }

    public static class Person {
        private String name;
        private Car cars;

        public Person(String name) {
            this.name = name;
        }

        public Person buys(String make, int price) {
            Car tmp = new Car(make, price);
            tmp.setNext(cars);
            cars = tmp;
            return this; // It means buy
        }

        public String getName() {
            return name;
        }

        public void showCars() {
            cars.showCars();
        }

        public void showCarsRev() {
            cars.showCarsRev();
        }

        public int getTotalPrice() {
            int sumAllCars = 0;
            Car tmp = cars;
            while (tmp != null) {
                sumAllCars += tmp.getPrice();
                tmp = tmp.getNext();
            }
            return sumAllCars;
        }

        public boolean hasCar(String make) {
            Car tmp = cars;
            while (tmp != null) {
                if (tmp.getMake().equalsIgnoreCase(make))
                    return true;
                tmp = tmp.getNext();
            }
            return false;
        }

        public Car mostExpensive() {
            Car tmp = cars;
            Car expensive = tmp;
            while (tmp != null) {
                if (expensive.getPrice() < tmp.getPrice())
                    expensive = tmp;
                tmp = tmp.getNext();
            }
            return expensive;
        }
    }

    public static class Car {
        private String make;
        private int price;
        private Car next;

        public Car(String m, int p, Car n) {
            this.make = m;
            this.price = p;
            this.next = n;
        }

        public Car(String make, int price) {
            this(make, price, null);
        }

        public String getMake() {
            return make;
        }

        public int getPrice() {
            return price;
        }

        public Car getNext() {
            return next;
        }

        public void setNext(Car next) {
            this.next = next;
        }

        public void showCars() {
            Car tmp = this;
            while (tmp != null){
                System.out.println(tmp+" ");
                tmp = tmp.getNext();
            }
        }

        public void showCarsRev() {
            if (next != null) {
                next.showCarsRev();
                System.out.println(next);
            }
        }

        @Override
        public String toString() {
            return make + "(" + price + ")";
        }
    }
}
