package ifstatement;

public class Example {
    public static void main(String[] args) {
        String ayAdi = " Aralik";
        ayAdi = ayAdi.toLowerCase();

        if(ayAdi.equals("aralik ") || ayAdi.equals("ocak") || ayAdi.equals("subat")){
            System.out.println("Kis");
        }else if(ayAdi.equals("mart") || ayAdi.equals("nisan") || ayAdi.equals("mayis")){
            System.out.println("Ilkbahar ");
        }else if(ayAdi.equals("haziran") || ayAdi.equals("temmuz") || ayAdi.equals("agustos")){
            System.out.println("Yaz ");
        }else if(ayAdi.equals("eylul") || ayAdi.equals("ekim") || ayAdi.equals("kasim")){
            System.out.println("Sonbahar ");
        }else{
            System.out.println("Gecersiz ay adi ");
        }

    }
}
