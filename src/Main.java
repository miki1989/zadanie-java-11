import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int x;
        int y;

        System.out.println("Podaj X");
        x = scan.nextInt();
        scan.nextLine();
        System.out.println("Podaj Y");
        y = scan.nextInt();

        while (x > 0 && y > 0){
            System.out.println("Punkt (" + x + "," + y +") leży w I cwiartce układu współrzędnych");
            break;
        }

        while (x < 0 && y > 0){
            System.out.println("Punkt (" + x + "," + y +") leży w II cwiartce układu współrzędnych");
            break;
        }
        while (x < 0 && y < 0){
            System.out.println("Punkt (" + x + "," + y +") leży w III cwiartce układu współrzędnych");
            break;
        }
        while (x > 0 && y < 0){
            System.out.println("Punkt (" + x + "," + y +") leży w IV cwiartce układu współrzędnych");
            break;
        }

        scan.close();
    }
}
