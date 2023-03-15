import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double tutar, KdvOrani = 0.8, kdvOran18 = 0.18, kdvTutar, KdvOran;

       Scanner input = new Scanner(System.in);
       System.out.print("Lütfen tutarı giriniz: ");
       tutar = input.nextInt();



        if (tutar < 1000){
            kdvTutar = tutar * kdvOran18;
            kdvTutar = kdvTutar + tutar;
            System.out.println(kdvTutar);
        }else {
            kdvTutar = tutar * KdvOrani;
            kdvTutar = kdvTutar + tutar;
            System.out.println(kdvTutar);
        }
    }
}