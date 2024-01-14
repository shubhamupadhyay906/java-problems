package threads;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //will use this method if we implement Runnable interface at MyThread class
        Thread thread  = new Thread(myThread);
        thread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        thread.setName("new thread");
        System.out.println(thread.getName());
        //myThread.start();
    }
}
