package loops;

import java.util.Scanner;

public class ForLoopLessonExam_02 {
    public static void main(String[] args) {


        //Verilen bir Stringte 'a'karakteri haric tum karakterleri yazdiriniz
        //Madagaskar
        //1.Yol
        String str = "Madagaskar";
        String str1 = str.replaceAll("a" , "");
        System.out.println(str1);
        
        
        //2.Yol

        for(int i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);
            if (ch!='a'){
                System.out.print(ch);
            }

        }
        System.out.println();
        //3.Yol

        for(int i = 0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch== 'a'){
                continue;}
                System.out.print(ch);

                    }
        System.out.println();
        //Verilen bir Stringi tersten yazdiriniz
        String st = "Hayalim Manhattan'da bir ofis acmak";
        String stTers="";

        for (int i = st.length()-1; i>=0 ; i--){
            System.out.print(st.charAt(i));}

            System.out.println("\n/////////////////////////////////////////");

            String f = "AyseATALAY";
            String fTers = "";

            for (int k =f.length()-1 ; k>=0 ; k--){
                fTers = fTers +  f.charAt(k);
                System.out.println(fTers);
            }
        System.out.println("\n/////////////////////////////////////////");

            String s = "I LOVE YOU";
            String sTers = "";
             for (int a =s.length()-1 ; a>=0 ; a--){
                  sTers += s.charAt(a);
                 System.out.println(sTers);
             }

        System.out.println("\n/////////////////////////////////////////");

             String u = "I LOVE YOU";
             String uTotal = "" ;
        for (int i = 0; i <u.length(); i++) {
            uTotal += u.charAt(i);
            System.out.println(uTotal);
            System.out.println("\n/////////////////////////////////////////");

            /*Verilen bir cumleyi * ile gizleyin, 10. karakterden sonrasini yazdiriniz

            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen Bir Cumle Giriniz");
            String verilenCumle = input.nextLine();
            String bos = "";
            for (int j = 0; j <verilenCumle.length() ; j++) {
            devamini yapacagim
             */


            }




        }


            }

