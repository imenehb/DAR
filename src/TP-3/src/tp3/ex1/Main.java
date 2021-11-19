package tp3.ex1;

public class Main {

     public static class c1 extends Thread {
        @Override
        public void run (){
            System.out.println("my thread is running");
        }
    }
    public static class c2 extends Thread {
        @Override
        public void run (){
            System.out.println("my thread is running");
        }
    }

        // create a class that extends thread and another one that implements runnable
    // they should print 'my thread is running' when running
    // when both terminated, print 'it s over !!'

    public static void main(String[] args) throws InterruptedException {
    c1 t1= new c1();
    t1.start();
    t1.join();
    Thread t2=new Thread(new c2());
    t2.start();
    t2.join();
    System.out.println("it s over !");
    }
}
