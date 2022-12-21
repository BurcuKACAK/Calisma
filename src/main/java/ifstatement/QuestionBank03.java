package ifstatement;

import java.util.Scanner;

public class QuestionBank03 {
    public static void main(String[] args) {
        /*
        Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
         Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of month");
        int numOfMonth = input.nextInt();

        if (numOfMonth==1){
            System.out.println("January");
        }else if (numOfMonth ==2){
            System.out.println("February");
        } else {
            System.out.println("Another number of month");
        }


    }
}
