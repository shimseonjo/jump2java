public class Sample {
    int a = 0;
    void varTest(int a){
        this.a++;
        System.out.println("varTest this.a: "+ this.a + " a: "+a);
    }
    public static void main(String[] args) {
        int a = 2;
        Sample s = new Sample();
        s.varTest(a);
        System.out.println("main : "+a);
    }
}
