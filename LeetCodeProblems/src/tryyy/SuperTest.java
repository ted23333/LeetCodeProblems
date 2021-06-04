package tryyy;

public class SuperTest {
    static ThreadLocal local = new ThreadLocal(){
     @Override
     protected Object initialValue(){
         return "peter";
     }
    };

    public static void main(String[] args) throws InterruptedException {
        local.set("linda");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(local.get());
            }
        });
        t.start();
        Thread.sleep(10000);

    }
}
