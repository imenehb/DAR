package tp3.ex2;

public class StaticCounter {
    private static int counter = 0;

    // todo : implement me
    synchronized public static void increment(){
        //increment counter and print it
        counter=counter+1;
        System.out.println(counter);
    }
}
