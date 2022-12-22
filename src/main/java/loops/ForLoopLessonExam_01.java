package loops;

public class ForLoopLessonExam_01 {
    public static void main(String[] args) {
        //Example 1: 21'den 180'e kadar hem 4 hem de 6 ile bolunebilen sayilari yazdiriniz

        for (int i =21 ; i<181 ; i++ ){
            if(i%4==0 && i%6==0){
                System.out.print(i+ " - ");
            }
        }
        System.out.println("\n/////////////////////////////////////////");

        //Example 2: Size verilen kucuk harfle yazilmis olan Stringin indexi cift sayi olan karakterlerini buyuk harf yapiniz
        //              String a = "ankara"; ==> "AnKaRa"

        String a = "Kayseri";

        for (int i = 0; i <a.length() ; i++) {

            String ch = a.substring(i  , i+1);

            if (i%2==0){
                System.out.println(ch.toUpperCase());
        }
        }
        System.out.println("\n/////////////////////////////////////////");

        // Size verilen bir Stringde a harfine kadar olan kismi yazdiriniz

            String s = "Ey Edip Uyan";

            for (int i = 0 ; i<s.length() ; i++){
                char ch = s.charAt(i);
                if (ch == 'a'){
                    break;
                }
                System.out.print(s.charAt(i));
            }
        System.out.println("\n/////////////////////////////////////////");

            //Verilen bir Stringin son m harfinden sonraki harflerini tersten yazdiriniz

        String str = "Seni Sevmek Suc mu Ey Java ";

        for (int i =str.length()-1 ; i>=0 ; i--) {

            char ch = str.charAt(i);
            if (ch =='m'){
                break;
            }
            System.out.print(str.charAt(i));

        }

        System.out.println("\n/////////////////////////////////////////");


        String s1 = "";
        for(Integer i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                s1 = s1 + i + " ";
            }
        }
        System.out.println(s1);

        System.out.println("\n/////////////////////////////////////////");


        String m = "I love you";
        StringBuffer mTers = new StringBuffer(m);
        System.out.println(mTers.reverse());

        System.out.println("\n/////////////////////////////////////////");

        String f = "Gulrengi";
        String fTersi = "";

        for (int i = f.length()-1 ; i>=0 ; i--){
            fTersi = fTersi + f.charAt(i);
        }System.out.println(fTersi);

    }

}
