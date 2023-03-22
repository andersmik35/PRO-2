package ogpave1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {
    private int time;

    private List<String> times = new ArrayList<>();

    public MyTime() {
        time = 0;
    }

    public int getTime() {
        return time;
    }

    public void increse(){
        time++;
    }

    public void reset(){
        setTime(0);
    }

    public void setTime(int time) {
        this.time = time;
    }



    public void saveTime(){
        times.add(this.toString());
    }

    public List<String> getTimes() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "time=" + time +
                '}';
    }
}
