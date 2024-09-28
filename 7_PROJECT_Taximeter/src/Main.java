import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pleasse , enter the km data :");
        double km = scan.nextDouble();

        // it costs 2.20 ₺ per kilometer
        //The short distance amount is 20 TL. For fees under 20 TL, 20 TL will be charged again.
        //The opening fee for the taximeter is 10 TL.

        double fee = (km * 2.20) + 10;

        if (fee < 20) {
            fee = 20;
        }

        System.out.println("Taximeter : " + fee + "₺");


    }
}