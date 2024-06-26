package practise.innerclass;

public class AnonymousInnerClassPrg {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Anonymous Inner class....");
            }
        };
        Thread t = new Thread(r);
        t.start();

    }
}
