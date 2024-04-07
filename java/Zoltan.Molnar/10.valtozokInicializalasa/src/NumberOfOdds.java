public class NumberOfOdds {
    private static int upperBound = 100;
    private final static int upperBound2 = calculateInitValue();

    public static void main(String[] args) throws Exception {
        int numberOfOdds = 0;

        for (int i = 1; i <= upperBound; i++) {
            if (i % 2 != 0) {
                numberOfOdds++;
            }
        }

        System.out.println(numberOfOdds);
    }

    private static int calculateInitValue() {
        return 0;
    }
}
