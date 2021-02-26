import java.util.Locale;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        String ilkisim;
        String soyisim;
        Scanner girdi=new Scanner(System.in);
        System.out.println("ilkisim gir");
        ilkisim=girdi.next();
        System.out.println("soyisim gir");
        soyisim=girdi.next();
        System.out.println(ilkisim.substring(0,1).toUpperCase()+ilkisim.substring(1));
        System.out.println(soyisim.substring(0,1).toUpperCase()+soyisim.substring(1));
    }
}
