package threads.threadproblem;

public class Company {

    int value;

    boolean check = false;

    //false chance producer
    //true chance consumer
    public synchronized void producerCompany(int value) throws Exception {

        if (check) {
            wait();
        }
        System.out.println("Produced : " + value);
        check = true;
        notifyAll();

    }

    public synchronized int consumerCompany(int value) throws Exception {
        if (!check) {
            wait();
        }

        System.out.println("Consumed : " + value);
        notifyAll();
        check = false;
        return value;

    }

}
