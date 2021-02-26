import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        String ilkisim;
        String soyisim;
        Scanner girdi=new Scanner(System.in);
        System.out.println("ilkisim gir");
        ilkisim=girdi.next();
        System.out.println("soyisim gir");
        soyisim=girdi.next();
        System.out.println(ilkisim.length());
        System.out.println(soyisim.length());
    }
}
