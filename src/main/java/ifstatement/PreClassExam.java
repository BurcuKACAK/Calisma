package ifstatement;

import java.util.Scanner;

public class PreClassExam {

    public static void main(String[] args) {

        /*
            Kullanicidan isim isteyin.Eger isim
          -a harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
          -Z harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
          -Ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor"yazdirin

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Isim Giriniz");
        String name =  input.next();
        boolean n = name.contains("a");
        boolean m = name.contains("Z");

        if (n)
        {
            System.out.println("Girdiginiz isim a harfi iceriyor");    }
        else if (m){
            System.out.println("Girdiginiz isim Z harfi iceriyor");}
        else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }

        /*
        Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Adinizi Giriniz");
        String name1 = scan.next();
        System.out.println("Lutfen Soyadinizi Giriniz");
        String name2 = scan.next();

        int nameOfLength1 = name1.length();
        int nameOfLength2 = name2.length();

        if (nameOfLength1>nameOfLength2){
            System.out.println(name1);
        }else if (nameOfLength2>nameOfLength1){
            System.out.println(name2);
        } else {
            System.out.println("Adiniz ve Soyadiniz Esit.Lutfen farkli bir deger giriniz!");
        }

    }
}
