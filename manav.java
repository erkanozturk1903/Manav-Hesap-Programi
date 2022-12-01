import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,armutkg,elmakg,domateskg,muzkg,patlicankg,toplam;
      
        Scanner mec = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo: ");
        armutkg=mec.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        elmakg=mec.nextDouble();
        System.out.print("Domates  Kaç Kilo: ");
        domateskg=mec.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        muzkg= mec.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        patlicankg= mec.nextDouble();

        toplam=armut*armutkg+elma*elmakg+domates*domateskg+muz*muzkg+patlican*patlicankg;
      
        System.out.println("almış Olduğunuz Meyve ve Sebzelerinin Toplam Tutarı : " +toplam);


    }
}
