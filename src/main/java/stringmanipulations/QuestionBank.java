package stringmanipulations;

public class QuestionBank {

    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        //toplamını bulunuz

        String l = "BETUL";
        int sonIndex = l.length()-1;
        int ilkAscii = l.charAt(0);
        int sonAscii = l.charAt(sonIndex);
        System.out.println(ilkAscii+sonAscii); //142

        String g = "Mehmet";
        int gSonIndex = g.length()-1;
        System.out.println("gSonIndex = " + gSonIndex);
        int gAscii= g.charAt(0);
        System.out.println("gAscii = " + gAscii);
        int gSonAscii = g.charAt(gSonIndex);
        System.out.println("gSonAscii = " + gSonAscii);
        System.out.println("Indexler Toplami = " + (gAscii+gSonAscii) );

        //Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        //Örnek:'Ali Can' için n yazdırmalısınız.
        // ‘Miami’ için i yazdırmalısınız

        String m = "  Ali Can   ";
        String m1 = m.trim().substring(6);
        System.out.println("Bosluk Olmayan Son Karakter=" + m1);

        String n = " Miami  ";
        String n1 =n.trim().substring(4);
        System.out.println("Bosluk Olmayan Son Karakter=" + n1);

        //Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir

        String s = "1a3Bcf4!...";
        int s1 = s.replaceAll("[0-9]", "").length();
        System.out.println("Rakam Olmayan Karakter Sayisi=" +s1);

        //Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        //yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız

        String f = "Java";
        String f1 = f.substring(1);
        System.out.println(f1);

        //Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        //büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız


        //1.Yol
        String y = "Java";
        Integer sonKrkIndex = y.length()-1;
        String sonKrkDisindakiler = y.substring(0,3).toUpperCase();
        System.out.println("son karakter disindaki tum karakterler buyuk harf ile : " + sonKrkDisindakiler);
        //2.Yol
        String u = "Java";
        String u1 = u.toUpperCase().substring(0,3);
        System.out.println(u1);





    }
}
