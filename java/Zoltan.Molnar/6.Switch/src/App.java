public class App {
    public static void main(String[] args) throws Exception {
        int szam = 1;
        int honap = 2;
        String nap = "Szerda";

        switch (szam) {
        case 1:
            System.err.println("Hetfo");
            break;
        default:
            System.err.println("Ertelmetlen");
            break;
        }

        switch (honap) {
        case 1:
        case 2:
        case 3:
            System.out.println("31 napos a honap");
            break;
        default:
            System.out.println("Ertelmetlen");
            break;
        }

        switch (nap) {
        case "szerda":
            System.out.println("A het harmadik napjar");
            break;
        default:
            System.out.println("Ertelmetlen");
            break;
        }
    }
}
