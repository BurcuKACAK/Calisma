package loops;

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
            System.out.print(st.charAt(i));

        }



    }
}
