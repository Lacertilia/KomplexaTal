public class KomplexTest {
    public static void main(String[] args) {
        Komplex k = new Komplex(3,5);
        Komplex b = new Komplex(4,6);
        Komplex n = k.add(b); //test add
        Komplex m = k.multiply(b); //test multiply
        System.out.println(k.toString()); //test toString
        System.out.println("z= " + m.r + " + " + m.i + "i");
        System.out.println("Vinkeln är " + k.arg() + "Rad"); //test angle
        System.out.println(k.equals(b)); //test equals
    }
}
