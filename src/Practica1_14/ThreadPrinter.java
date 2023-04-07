package Practica1_14;

public class ThreadPrinter implements Runnable {

    private String threadName;
    private Object lock;

    public ThreadPrinter(String name, Object lock) {
        this.threadName = name;
        this.lock = lock;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                System.out.println(threadName);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(" (Practical №1.10) Variant 4. Group RIBO-03-21. Matolygin Z.I. ");
        Object lock = new Object();
        Thread t1 = new Thread(new ThreadPrinter("Thread-0", lock));
        Thread t2 = new Thread(new ThreadPrinter("Thread-1", lock));
        t1.start();
        t2.start();
        Thread.sleep(5000); // Работает 5 секунд
        t1.interrupt();
        t2.interrupt();
    }
}