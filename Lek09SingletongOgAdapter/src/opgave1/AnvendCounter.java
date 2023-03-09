package opgave1;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter counter = Counter.getUniqueInstance();

        System.out.println(counter.getCount());
        counter.addCount();
        System.out.println(counter.getCount());

        counter.multiplyCount();
        System.out.println(counter.getCount());

        counter.resetCount();
        System.out.println(counter.getCount());

    }
}
