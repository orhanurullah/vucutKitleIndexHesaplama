import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden (ayraç olarak virgül kullanılmalı) giriniz.");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        double vucutKitleIndex = kilo / Math.pow(boy,2);
        System.out.println("Vücut Kitle İndexiniz : " + vucutKitleIndex);
    }
}
