import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int setalasiSebessegKpo = 5;
        int autoSebessegKpo = 50;

        Scanner beaolvaso = new Scanner(System.in);

        System.out.print("Milyen messzire mesz (km-ben): ");
        double tavolsag = beaolvaso.nextDouble();

        System.out.print("Mennyit vagy hajlando setalni (percben): ");
        int maxSetalasiIdoPercben = beaolvaso.nextInt();

        System.out.print("Van kocsid (0 = nincs, 1 = van): ");
        boolean vanKocsi = beaolvaso.nextInt() == 1;

        double setalasiIdoPercben = (tavolsag / setalasiSebessegKpo) * 60;

        System.out.println("\n ====== \n");

        if (vanKocsi) {
            if (setalasiIdoPercben < maxSetalasiIdoPercben) {
                System.out.println("Menj gyalog");
                System.out.println(setalasiIdoPercben + " perc lesz az ut");
            } else {
                double autoIdoPercben = (tavolsag / autoSebessegKpo);
                System.out.println("Menj kocsival");
                System.out.println(autoIdoPercben + " perc lesz az ut");
            }
        } else {
            System.out.println("Nincs kocsid, ugyis gyalogolnod kell.");
            System.out.println(setalasiIdoPercben + " perc lesz az ut");
        }
    }
}
