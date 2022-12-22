package loops;

import java.util.Scanner;

public class ForLoopLessonExam_04 {
    public static void main(String[] args) {
 /* Example 1: Asagidaki ciktiyi verecek kodu yaziniz
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                  .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                  ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                  ....
        */

        for(int i =1 ; i<5 ; i++){
            System.out.println("Week: "+ i );
            for (int j =1 ; j<8 ; j++){
                System.out.println("Day: " +j);
            }
        }
        System.out.println("\n/////////////////////////////////////////");

           /*
         Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X

     */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz");
        int row = input.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int column = input.nextInt();

        for(int i = 1; i<=row ; i++){
            for (int j = 0; j <= column; j++) {
                System.out.print("X ");

            }
            System.out.println();



        }


    }
}
