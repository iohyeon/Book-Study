package doit.java.chap01;

import java.util.Scanner;

public class 연습문제10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("그 수는 "+Integer.toString(num).length()+"자리입니다.");
    }
}
