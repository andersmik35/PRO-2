package ex2student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));


        runners.forEach(r -> System.out.println(r.toString()));

        runners.forEach(r -> {
            if (r.getLapTime() < 30)
                System.out.println(r.toString());
        });


        runners.sort((r1, r2) -> r1.getLapTime() - r2.getLapTime());

        runners.forEach(runner -> System.out.println(runner.toString()));


    }


    public static List<Runner> findAll(List<Runner> runners, Predicate<Runner> filter) {
        List<Runner> r1 = new ArrayList<>();
        for (Runner r : runners) {
            if (filter.test(r))
                r1.add(r);
        }
        return r1;


    }
}