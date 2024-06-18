class person {
    static String cityname;
    String name;
}

public class Day19 {
    public static void main(String[] args) {
        person.cityname = "Vizag";
        person p1 = new person();
        person p2 = new person();
        p1.name = "sai";
        p2.name = "basu";
        System.out.println(p1.name + " lives in " + p1.cityname);
        System.out.println(p2.name + " lives in " + p2.cityname);
    }
}
