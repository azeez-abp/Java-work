package concurrency;
////////we can create thread by letting the a class extends thread
public class ThreadP extends Thread{
    @Override
    public void run() {
       // super.run();
        System.out.println("ANOTHER THREAD");
    }

}
