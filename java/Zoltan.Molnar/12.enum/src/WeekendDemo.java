public class WeekendDemo {
    public static void main(String[] args) {
        Day selected = null;
        selected = Day.forName("Monday");
        selected = Day.valueOf("MONDAY");

        System.out.println(selected.getAbbreviation());

        switch (selected) {
        case MONDAY:
            System.out.println("MONDAYs are boring...");
            break;
        default:
            System.out.println("Default");
            break;
        }
    }
}
