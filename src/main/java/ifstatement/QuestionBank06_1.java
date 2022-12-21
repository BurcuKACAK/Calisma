package ifstatement;

import java.util.Scanner;

public class QuestionBank06_1 {


    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi seciniz.\n mildenKmye\nsaniyedenSaate\nfahrenaytdanSantigarata ");
        String operator = input.next();

        if(operator.equals("mildenKmye")){
            System.out.println("Cevirmek istediginiz degeri giriniz");
            double mil = input.nextDouble();
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate")){
            System.out.println("Cevirmek istediginiz degeri giriniz");
            double saniye = input.nextDouble();
            System.out.println((saniye /60)/60);
        }else if(operator.equals("fahrenaytdanSantigarata")){
            System.out.println("Cevirmek istediginiz degeri giriniz");
            double fahrenayt= input.nextDouble();
            System.out.println((fahrenayt -32)*5/9);
        }






    }
}
