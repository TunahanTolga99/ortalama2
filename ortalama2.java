import java.util.Scanner;
public class ortalama2 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce;
        double avarage;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();

        if ((mat >= 0 && mat <= 100) && (turkce >= 0 && turkce <= 100) &&
                (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)){

            avarage = (mat + turkce + fizik + kimya) / 4;

            System.out.println("Geçme Notu : 55 ");
            System.out.println("Ortalamanız : " + avarage);

            if (avarage < 55) {
                System.out.println("Sınıfta Kaldınız");
            } else {
                System.out.println("Sınıfı Geçtiniz");
            }
        } else{
            System.out.println("Notlarınız Aralığı 0 ile 100  olmalıdır.");
        }
    }
}
