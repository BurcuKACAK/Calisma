package loops;

import java.util.Scanner;

public class DoWhile_PwdGiris {


    /*
                   Gecerli Username = "admin"Password="pwd123"dur.
                   Kullanicidan username ve password'u alin.
                   Username ve password dogru ise "Hesabiniza hosgeldiniz!" yazidirin.
                   Username veya password yanlis ise 4 kere "Username ve Password'unuzu giriniz" mesaji versin
                   Username veya password 4. kere yanlis girilirse "Hesabiniz Bloke Olmustur"mesaji vererek islemi tamamlayiniz.
            */


    public static void main(String[] args) {

        String kullaniciAdi = "admin";
        String password = "pwd123";

        Scanner input = new Scanner(System.in);
        int counter = 4;
        System.out.println("Lutfen Kullanici Adinizi Giriniz");


        do {
          if(input.next().equals(kullaniciAdi)){
              System.out.println("Sifrenizi Giriniz");
              if(!input.nextLine().equals(password)){
                  System.out.println("Hatali Sifre Girdiniz\nKullanici Adinizi Giriniz");
              }else {
                  System.out.println("....***HESABINIZA HOS GELDINIZ***....");
                  break;
              }

          }else{
              System.out.println("Kullanici Adini Hatali Giris Yaptiniz!!!\n" + (counter-1) + " Giris Hakkiniz Kaldi");

              counter --;
              System.out.println("Kullanici Adini Tekrar Giriniz");

          }

          if(counter==0){
              System.out.println("Hesabiniz Bloke Olmustur!!!");
          }

        } while (counter !=0);



    }
}




