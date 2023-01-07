package loops;

import java.util.Scanner;

public class ForLoopLessonExam_05 {
    public static void main(String[] args) {
        /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */

        for (int i = 1; i <6 ; i++) {
            for (int j = 1 ; j <=i ; j++) {
                System.out.print(j + " ");
                }
            System.out.println();

        }

        System.out.println("\n/////////////////////////////////////////");
/*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
    */

        for (int i = 1; i<=4; i++) {
            for (int k =4 ; k>=i ; k--) {
                System.out.print("* ");
            }
            System.out.println();

        }

        }

    }


