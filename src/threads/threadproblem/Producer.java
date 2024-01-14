package threads.threadproblem;

public class Producer extends Thread {

    Company company;

    Producer(Company company) {
        this.company = company;
    }

    public void run() {
        int i = 1;
        while (i <= 5) {
            try {
                this.company.producerCompany(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
