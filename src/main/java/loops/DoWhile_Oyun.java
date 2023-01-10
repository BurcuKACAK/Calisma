package loops;

import java.util.Scanner;

public class DoWhile_Oyun {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        int sayi =0;

        do {
            System.out.println("Lutfen Bir Sayi Giriniz");
            sayi = input.nextInt();


            if (sayi>=100){
                System.out.println("Kazandiniz");
            }

        }while (sayi>=100);

        System.out.println("Kaybettiniz");




}
}