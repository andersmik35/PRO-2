package opgave1;

public class Counter {

    private static Counter uniqueInstance;

    int count = 0;

    private Counter() {

    }

    public static Counter getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Counter();
        }

        return uniqueInstance;
    }

    public void addCount(){
        count++;
    }

    public void resetCount(){
        count = 0;
    }


    public int getCount() {
        return count;
    }


    public void multiplyCount(){
        count = count * 2;
    }
}
