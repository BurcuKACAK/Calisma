package arrays;

import java.util.Arrays;

public class LessonExam {

    //Example 1 : Arraydeki her elamani sonuna "!"isareti koyarak ekrana yazdiriniz.
    public static void main(String[] args) {

        String isim [] = new String [5];

        isim [0] = "Ali";
        isim [1] = "Veli";
        isim [2] = "Ayse";
        isim [3] = "Fatma";
        isim [4] = "Hayriye";

        for (int i = 0; i<isim.length; i++){
            System.out.println(isim[i]+"!");
        }
        System.out.println("*********************************************************");
        //Array'daki elemanlarin sonuna ? koyunuz

        for (int i =0; i<isim.length ; i++){
            System.out.println((isim)[i]+"?");
        }
        System.out.println("*********************************************************");

        for (int i = 0 ; i< isim.length; i++){
            System.out.println("$"+isim[i]+"$");
        }
        System.out.println("*********************************************************");

        // Example1: String array olusturun, icinde 7 tane eleman ekleyin, ilk eleman ile
        //son elemanin icerdigi karakter sayilari toplamini ekrana yazdiriniz

        String arr [] = new String[7];

        arr [0] = "Oku";
        arr [1] = "Anla";
        arr [2] = "Anlat";
        arr [3] = "Dinle";
        arr [4] = "Ogren";
        arr [5] = "Bos Durma";
        arr [6] = "Calis";


        System.out.println(arr[0].length() + arr[arr.length-1].length());


       /*
        tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirinizint total = 0;
        */

        int total =0;
        for(int i =0; i<arr.length; i++){

            total += arr[i].length();

        }
        System.out.println(total);



        System.out.println("*********************************************************");

        //Example 2: String array olusturun, icinde 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdiriniz

        String brr [] = new String [5];


        brr [0] = "Ankara";
        brr [1] = "Kayseri";
        brr [2] = "Istanbul";
        brr [3] = "Izmir";
        brr [4] = "Kars";

        int toplam = 0;
        for(int i = 0; i< brr.length ; i++){
            toplam+=brr[i].length();

        }
        System.out.println(toplam);//30

        System.out.println("*********************************************************");

        int sum =0;
        for(String  w : brr){

            sum+=w.length();

        }
        System.out.println(sum);

















































    }
}
