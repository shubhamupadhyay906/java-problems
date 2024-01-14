package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentThreadExample {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        //as t1 and t2 are thread safe but two operation at once can't be perfomed
        Runnable thread1 = () -> {
            for (String str : list) {
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        System.out.println(" +++++++++++++++++++++ ");
        Runnable thread2 = () -> {
            list.add("six");
            list.add("seven");
            for (String str: list) {
                System.out.println(str);
            }
        };
        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}
