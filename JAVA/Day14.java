public class Day14 {
    public static void main(String[] args) {
        Constructor S = new Constructor();
        S.i = 100;
        S.j = "DENDETI SAI";
        System.out.println(S.j);
        System.out.println(S.i);
    }
    static class Constructor {
        int i;
        String j; 
    }
}
