public class Person {
    private String name;
    private int age;
    private Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public static Car[] getCars(Person[] persons) {
        int countCars = 0;
        for (Person p : persons)
            if (p.getCar() != null)
                countCars++;

        Car[] cars = new Car[countCars];

        countCars = 0;
        for (Person p : persons)
            if (p.getCar() != null)
                cars[countCars++] = p.getCar();

        return cars;

    }

    public static Car[] expensiveCars(Person[] persons, int priceLimit) {
        int countCars = 0;
        for (Person p : persons)
            if (p.getCar() != null && p.getCar().getPrice() > priceLimit)
                countCars++;

        Car[] cars = new Car[countCars];

        countCars = 0;
        for (Person p : persons)
            if (p.getCar() != null && p.getCar().getPrice() > priceLimit)
                cars[countCars++] = p.getCar();

        return cars;
    }

    public static String getPrice(Person[] persons, String name) {
        for (Person p : persons)
            if (p.getName().equals(name))
                if (p.getCar() != null)
                    return p.getCar().getPrice() + "";
                else
                    return "-1";
        return "-2";
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
