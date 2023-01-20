package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int var1 = 10;
        int var2 = 2;
        int hasil;
//        operator aritmatika :
//        1. Penjumlahan
        hasil = var1 + var2;
        System.out.println(var1+" + "+var2+" = "+hasil);

//        2. Pengurangan
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d",var1,var2,hasil);
        System.out.println();

//        3. Perkalian
        hasil = var1 * var2;
        System.out.printf("%d * %d = %d",var1,var2,hasil);
        System.out.println();

//        4. Pembagian
        hasil = var1 / var2;
        System.out.printf("%d / %d = %d",var1,var2,hasil);
        System.out.println();

//        5. Modulus
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d",var1,var2,hasil);
        System.out.println();


    }
}