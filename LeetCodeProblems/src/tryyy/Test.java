package tryyy;
class MyThread1 extends Thread{
    public void run(){
        Test.n1 = Test.n2;
         Test.n2 = -1;
    }
}
class MyThread2 extends Thread{
    public void run(){
        Test.n2 = Test.n1;
        Test.n1 = -1;
        System.out.printf("%d  %d \n",Test.n1,Test.n2);
    }
}
public class Test {
   public static int n1 = 0;
    public static int n2 = 1;

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
