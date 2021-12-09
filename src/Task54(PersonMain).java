public class Main3 {
    public static void main(String[] args) {
        Persons prs = new Persons("Mesut", 24);
        Persons prs2 = new Persons("Enes", 18);
        Persons prs3 = new Persons("Salih", 21);
        Persons prs4 = new Persons("Ufuk", 19);

        //Sorting of the list with the help of compareTo method
        Persons [] res2 = {prs, prs2, prs3, prs4};
        res2 = prs.arrSort2(res2);
        System.out.println(res2[0].getName());
        System.out.println(res2[1].getName());
        System.out.println(res2[2].getName());
        System.out.println(res2[3].getName());
    }
}
