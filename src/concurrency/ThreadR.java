package concurrency;
////////we can create thread by letting the a class implement runable interface
public class ThreadR implements Runnable {
    @Override
    public void run() {
         System.out.println("SYSTEM THREAD THROUGH RUNABLE");
    }
}
