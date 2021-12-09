public class Persons {
    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return super.toString();
    }

    public int getAge() {

        return age;
    }

    public int compareTo(Persons a, Persons b) {
        int result = a.age == b.age ? 0 : (b.age > a.age ? 1 : -1);
        return result;
    }

    //Array sorting method with the usage of compareTo method
    public Persons[] arrSort2(Persons[] per) {
        for (int i = 0; i < per.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < per.length; j++) {
                if (compareTo(per[j], per[index]) == 1) {
                    index = j;
                }
            }
            Persons smallerAge = per[index];
            per[index] = per[i];
            per[i] = smallerAge;
        }
        return per;
    }
}
