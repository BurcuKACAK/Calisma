package ifstatement;

import java.util.Scanner;

    public class QuestionBank01 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"

        Ingilizce yaziniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month name");
        String monthName = input.next();

        monthName = monthName.toLowerCase();

     if (monthName.equals("december") || monthName.equals("january") || monthName.equals("february")){
         System.out.println("Winter");
     } else if (monthName.equals("march") || monthName.equals("april") || monthName.equals("may")){
         System.out.println("Spring");
     } else if (monthName.equals("june") || monthName.equals("july")|| monthName.equals("august")){
         System.out.println("Summer");
     } else if (monthName.equals("september") || monthName.equals("october")|| monthName.equals("november")){
         System.out.println("Autumn");
     } else {
         System.out.println("Invalid month name");

     }

        System.out.println();




    }
}
