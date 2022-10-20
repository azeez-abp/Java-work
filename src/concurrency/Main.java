package concurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("ANOTHER THREAD MAIN");
        Thread one = new ThreadP(); ///note the output order
        Runnable two  = new ThreadR();
        one.start();
        two.run();

         new Thread(){
             public void run(){
                 System.out.println("ANONYMOUS CLASS THRED RUN");
             }
         }.start();

         System.out.println("ANOTHER THREAD MAIN TWO");
    }
}
