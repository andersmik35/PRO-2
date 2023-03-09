package opgave3;

public class Main {
    public static void main(String[] args) {
        Foedevarer k1 = new Foedevarer(100,"Bagel");

        ElVare el1 = new ElVare(600,"Adapter");

        System.out.println(k1.beregnMoms());

        System.out.println(el1.beregnMoms());

        System.out.println(k1.beregnMoms());



        Spiritus spiritus = new Spiritus(200,"Gin");
        Adapter adapter = new Adapter(200,"Gin", spiritus);

        System.out.println(adapter.beregnMoms());
    }
}
