package stringmanipulations;

public class QuestionBank2 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız
         */

        String str1 = "Java";
        int str2 = str1.length()-1;
        String str3 = str1.substring(1,str2).toUpperCase();
        System.out.println(str3);

        /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
        Örnek:‘Ali Can’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdı
         */

        String x = " Ali Can ";

    }
}
