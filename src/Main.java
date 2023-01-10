package src.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double toplam=0;
        int tSayi=0,sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz :");
        sayi = input.nextInt();

        for (int i=1; i<=sayi; i++){
            if(i%3 == 0 && i%4 == 0){
                System.out.println(i);
                toplam+=i;
                tSayi++;
            }
        }
        System.out.println("Ortalama :" + toplam/tSayi);
    }
}