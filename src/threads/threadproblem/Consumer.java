package threads.threadproblem;

public class Consumer extends Thread {

    Company company;

    Consumer(Company company) {
        this.company = company;

    }

    public void run() {
        int i = 1;
        while (i <= 5) {
            try {
                this.company.consumerCompany(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }
}
