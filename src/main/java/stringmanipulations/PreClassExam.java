package stringmanipulations;

import java.util.Scanner;

public class PreClassExam {
    public static void main(String[] args) {

        //String metotlarini kullanarak "Java ogrenmek123 cok guzel@" Stringini
        //"Java ogrenmek cok guzel"sekline getirin

        String a = "Java ogrenmek123 cok guzel@";
        String a1 = a.replaceAll("\\d", "").replaceAll("\\p{Punct}" , "");
        System.out.println(a1);

        /*Asagida String seklinde verilen fiyatlarin toplamini bulunuz
        String str1 = "$13.99"
        String str2 = "10.55"
        */

        String str1 = "$13.99";
        String str2 = "$10.55";


        String str3 = str1.replace("$", "");
        String str4 = str2.replace("$", "");

        double total = Double.valueOf(str3)+Double.valueOf(str4);
        System.out.println("Total Price = $" + total);

    //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 Harfli Bir Kelime Giriniz");
        String m = input.next();

        StringBuffer m1 = new StringBuffer(m);
        System.out.println(m1.reverse());

        /*
        Kullanicidan bir sifre girmesini isteyiniz.Eger asagidaki sartlari sagliyorsa
        "Sifre Basari ile Tanimlandi" , sartlari saglanmaz ise "Islem Basarisiz! Lutfen Yeni Bir Sifre Giriniz"yazdir
        -Ilk harf buyuk olmali
        -Son harf kucuk olmali
        -Sifre bosluk icermemeli
        -Sifre uzunlugu en az 8 karakter olmali

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Sifre Giriniz");
        String psw = scan.next();
        String psw1 = psw.substring(0,1).toUpperCase();
        String psw2 = psw1.toLowerCase();
        String  psw3 = psw2.replace(" ", "");
        boolean psw4 = psw3.length()>7;
        if (psw4==true){
            System.out.println("Sifre Basari Ile Tanimlandi");
            }else if (psw4==false){
            System.out.println("Islem Basarisiz! Lutfen Yeni Bir Sifre Giriniz");
            }


















    }
}
