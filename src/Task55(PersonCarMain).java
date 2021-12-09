public class Main4 {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", 15000);
        Car c2 = new Car("Dodge", 11100);
        Car c3 = new Car("Buick", 11000);
        Person john = new Person("John", c1);
        Person mary = new Person("Mary", c2);
        Person kate = new Person("Kate");
        Person lucy = new Person("Lucy", c3);
        Person adam = new Person("Adam",
                new Car("Opel", 18000));
        Person[] persons = {
                john, mary, kate, lucy, adam, new Person("Jill"),
                new Person("Josh", new Car("Buick",12500))};

        Car[] cars = Person.getCars(persons);
        for (Car c : cars)
            System.out.print(c + " "); // or c.info();
        System.out.println();

        cars = Person.expensiveCars(persons, 12000);
        for (Car c : cars)
            System.out.print(c + " "); // or c.info();
        System.out.println();
        String name = "Adam";
        System.out.println("Price of " + name + "'s car: " +
                Person.getPrice(persons, name));
    }
}

