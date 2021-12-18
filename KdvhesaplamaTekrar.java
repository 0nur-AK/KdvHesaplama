import java.util.Scanner;
public class KdvhesaplamaTekrar {
    public static void main(String[] args) {
        double tutar , kdvOranı = 0.18 , kdvTutarı , kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Tutarını Giriniz : ");
        tutar = input.nextDouble();


        kdvTutarı = tutar * kdvOranı;
        kdvliTutar = tutar + kdvTutarı;

        System.out.println("Ürün Tutarı : " + tutar);
        System.out.println("Kdv Oranı : " + kdvOranı);
        System.out.println("Kdv Tutarı : " + kdvTutarı);
        System.out.println("Toplam Tutar :" + kdvliTutar);
    }
}
