import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[6];
        String[] weekDays = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri" }, alma = { "5" };

        System.out.println(alma);

        System.out.println(Arrays.toString(weekDays));
        printArray(numbers);
        numbers[0] = 5;
        numbers[1] = 16;
        numbers[4] = -8;

        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
    }
}
