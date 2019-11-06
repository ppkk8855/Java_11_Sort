package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入隨意三整數");
        int A,B,C,N;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        for(int i = 0;i<2;i++){
            if(A>B){
                N=A;
                A=B;
                B=N;
            }
            if (B>C){
                N=B;
                B=C;
                C=N;
            }
        }
        System.out.printf("數字由小至大為: %d %d %d",A,B,C);
    }

}
