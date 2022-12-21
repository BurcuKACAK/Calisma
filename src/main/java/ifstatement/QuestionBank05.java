package ifstatement;

import java.util.Scanner;

public class QuestionBank05 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three side length for triangle");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ikizkenarMi = a==b || a==c || b==c;
        boolean eskenarMi = a==b && b==c && a==c;
        if (eskenarMi){
            System.out.println("Eskenar Ucgen");
        } else if (ikizkenarMi){
            System.out.println("Ikizkenar Ucgen");
        }else {
            System.out.println("Cesitkenar Ucgen");
        }

    }
}
