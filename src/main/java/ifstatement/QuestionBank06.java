package ifstatement;

import java.util.Scanner;

public class QuestionBank06 {
    public static void main(String[] args) {
        /*
        Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyeden  Saate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdan Santigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
         */

      Scanner input =new Scanner(System.in);
      boolean flag = true;

        do {
            System.out.println("Yapmak istediginiz islemi seciniz.\n1 = Mil'e cevirme\n2 = Saat'e cevirme\n3 = Fahrenheit cevirme\nQ = Cikis ");
            String secim = input.next();

            if(secim.equalsIgnoreCase("Q")){
                flag = false;
            }

            switch (secim) {
                case "1":
                    System.out.println("Ceviri Yapmak Istediginiz Mil Degerini Giriniz");
                    double mil = input.nextDouble();
                    double km = mil * 1.61;
                    System.out.println(mil + " Mil = " + km + " Km'dir");
                    break;
                case "2":
                    System.out.println("Ceviri Yapmak Istediginiz Saniye Degerini Giriniz");
                    double saniye = input.nextDouble();
                    double saat = saniye / 3600;
                    System.out.println(saniye + " Saniye = " + saat + " Saat'tir");
                    break;
                case "3":
                    System.out.println("Ceviri Yapmak Istediginiz Fahrenheit Degerini Giriniz");
                    double fahrenheit = input.nextDouble();
                    double santigrat = fahrenheit / 33.8;
                    System.out.println(fahrenheit + "Fahrenheit = " + santigrat + " Santigrat'tir");
                    break;
                default:
                  break;
            }
        }while (flag);









    }
}
