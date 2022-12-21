package ifstatement;

import java.util.Scanner;

public class LessonExamNestedIf {

    public static void main(String[] args) {
        /*
            Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
            Eger calisan kadin ise;
            60 yasindan buyukse “Emekli Olabilir “yazdirin

            Eger calisan erkek ise;
            65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("Lutfen Yasinizi Giriniz");
        int age = input.nextInt();

        if (age<0 || age>120){
            System.out.println("Lutfen 0-120 arasinda bir deger giriniz");
        }

        else if (gender.equalsIgnoreCase("Kadin")){

            if (age>60){
                System.out.println("Emekeli Olabilir");
            } else {
                System.out.println("Calismali");
            }
        } else if (gender.equalsIgnoreCase("Erkek")){
            if (age>65){
                System.out.println("Emekli Olabilir");
            } else {
                System.out.println("Kesinlikle Calismali");
            }

        } else if (gender.equalsIgnoreCase("Digerleri")) {
            System.out.println("Tanimli Degil");
        }


    }

    }

