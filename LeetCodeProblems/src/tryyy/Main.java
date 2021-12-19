package tryyy;



class Main {
    int mark=0;
    public static void main(String[] args) {
    Main so = new Main();
    so.p();
    so.change();
    so.p();
    }
    public void change()
    {
        int mark = 233;
    }
    public void p()
    {
        System.out.println(mark);
        mark = 6;
        System.out.println(mark);

    }
}
