package doit.java.chap01;

import java.util.Scanner;

public class 연습문제13 {
    public static void main(String[] args) {
        System.out.println("정사각형을 출력합니다.");
        Scanner scan = new Scanner(System.in);
        System.out.print("변의 길이 :");
        int num = scan.nextInt();

        for(int j=0; j<num; j++) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
