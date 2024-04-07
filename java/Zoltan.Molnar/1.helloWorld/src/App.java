public class App {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 10;
        System.out.println("A=" + a + " B=" + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("A=" + a + " B=" + b);
    }
}
