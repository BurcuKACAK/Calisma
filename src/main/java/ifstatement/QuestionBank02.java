package ifstatement;

import java.util.Scanner;

public class QuestionBank02 {
    public static void main(String[] args) {

        /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        Not: Çözümdeki koşulların sıralarına dikkat ediniz.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sifrenizi Giriniz");
        String sifre = input.next();

        if(sifre.replaceAll("\\S" , "").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");

        } else if (sifre.replaceAll(" " , "").length()>=8){
            System.out.println("Gecerli Sifre");

        } else {
            System.out.println("Gecersiz Sifre");
        }

    }
}
