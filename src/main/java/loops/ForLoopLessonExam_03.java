package loops;

public class ForLoopLessonExam_03 {
    public static void main(String[] args) {
        //Size verilen bir String'in "Palindrome"olup olmadigini kontrol eden kodu yazinis

        String str = "civilc";
        String strTers ="";

        for (int i =str.length()-1 ; i>=0 ;  i--) {
            strTers+=str.charAt(i);}

                if (str.equalsIgnoreCase(strTers)){
                    System.out.println( str + " : Palindrome' dur");
                } else
                    System.out.println(str + " : Palindrome Degildir");
        System.out.println("\n/////////////////////////////////////////");

        //5'ten 8'e kadar tamsayilarin toplamini veren kodu yaziniz
        //      5+6+7+8==>26

        int sum = 0;
        for (int i = 5; i <9 ; i++) {
            sum+=i;

        }System.out.println("Toplam = " +sum);

        //200'den 400'e kadar tamsayilarin toplamini veren kodu yaziniz

            int i =0;
        for (int j = 200; j <401 ; j++) {

            sum+=j;

        }
        System.out.println("Toplam = " + sum);

        System.out.println("\n/////////////////////////////////////////");
         //7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz
                //7*8*9

        int multiply = 1;
        for(int j =7; j<10 ; j++){
            multiply=multiply * j;

        }
        System.out.println("Carpim =" +multiply);

        System.out.println("\n/////////////////////////////////////////");




    }
    }

