package seminars.seminar1.task;

import java.util.Scanner;

public class Computation {

    public static void count() {

        double windowsill = 0;
        double drainage = 0;
        double canopy = 0;
        double slopes = 0;
        double lath = 0;
        int price;

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите количество подоконников: ");
        int windowsillCount = iScanner.nextInt();
        for (int i = 0; i < windowsillCount; i++) {
            System.out.println(i + 1);
            System.out.print("Введите ширину: ");
            int windowsillWidth = iScanner.nextInt();
            System.out.print("Введите длину: ");
            int windowsillLength = iScanner.nextInt();
            windowsill += (double) (windowsillWidth * windowsillLength) / 1000000;
        }
        int priceWindowsill = (int) (Math.ceil((windowsill * 1700) / 100)) * 100;

        System.out.print("Введите количество отливов: ");
        int drainageCount = iScanner.nextInt();
        for (int j = 0; j < drainageCount; j++) {
            System.out.println(j + 1);
            System.out.print("Введите ширину: ");
            int drainageWidth = iScanner.nextInt();
            System.out.print("Введите длину: ");
            int drainageLength = iScanner.nextInt();
            drainage += (double) (drainageWidth * drainageLength) / 1000000;
        }
        int priceDrainage = (int) (Math.ceil((drainage * 1700) / 100)) * 100;

        System.out.print("Введите количество откосов: ");
        int slopesCount = iScanner.nextInt();
        int z = 0;
        for (int k = 0, n = 1; k < slopesCount; k++, n++) {
            System.out.println(k + 1);
            System.out.print("Введите ширину: ");
            int slopesWidth = iScanner.nextInt();
            System.out.print("Введите длину: ");
            int slopesLength = iScanner.nextInt();
            slopes += (double) (slopesWidth * slopesLength) / 1000000;
            if (n == 3) {
                System.out.print("Сколько створок в конструкции? (0 - дверь/балконный блок): ");
                int sash = iScanner.nextInt();
                if (sash == 0) {
                    z += 2000;
                } else if (sash == 1 || sash == 2) {
                    z += 1600;
                } else if (sash == 3) {
                    z += 1800;
                }
                n = 0;
            }
        }
        int priceSlopes = (int) ((Math.ceil((slopes * 850) / 100)) * 100) + z;

        System.out.print("Введите количество козырьков: ");
        int canopyCount = iScanner.nextInt();
        for (int g = 0; g < canopyCount; g++) {
            System.out.println(g + 1);
            System.out.print("Введите ширину: ");
            int canopyWidth = iScanner.nextInt();
            System.out.print("Введите длину: ");
            int canopyLength = iScanner.nextInt();
            canopy += (double) (canopyWidth * canopyLength) / 1000000;
        }
        int priceCanopy = (int) (Math.ceil((canopy * 1700) / 100)) * 100;

        System.out.print("Введите количество нащельников: ");
        int lathCount = iScanner.nextInt();
        double installing = 0;
        for (int g = 0; g < lathCount; g++) {
            System.out.println(g + 1);
            System.out.print("Введите ширину: ");
            int lathWidth = iScanner.nextInt();
            System.out.print("Введите длину: ");
            int lathLength = iScanner.nextInt();
            installing += (double) lathLength / 1000;
            lath += (double) (lathWidth * lathLength) / 1000000;
        }
        int priceLath = (int) ((int) ((Math.ceil((lath * 1700) / 100)) * 100) + ((Math.ceil((installing * 150) / 100)) * 100));

        System.out.print("Введите закупку: ");
        int purchasePrice = iScanner.nextInt();
        System.out.print("Введите площадь: ");
        double square = iScanner.nextDouble();
        price = (int) ((int) ((Math.ceil((purchasePrice * 1.37) / 100)) * 100) +
                ((Math.ceil((square * 1700) / 100)) * 100) + priceWindowsill +
                priceDrainage + priceCanopy + priceSlopes + priceLath);
        System.out.println("price = " + price);
        iScanner.close();
    }
}
