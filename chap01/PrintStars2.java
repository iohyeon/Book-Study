package doit.java.chap01;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do{
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        do{
            System.out.print("w값 : ");
            w = sc.nextInt();
        } while ( w<= 0 || w>n);

        StringBuilder sb = new StringBuilder();
        //str.repeat(반복할 숫자) : java11 문법이라 java8에 없음 ㅠㅠ
        for(int i = 0; i<n/w; i++){ //w갯수만큼 일단 줄 출력해버리고
//            System.out.println("*".repeat(w));

            for(int j=0; j<w; j++) {
                sb.append("*");
            }
            System.out.println(sb);
            sb = new StringBuilder();
        }

        int rest = n%w;
        sb = new StringBuilder();
        if(rest != 0) { //나머지개수 만큼 *다시 출력
//            System.out.println("*".repeat(rest));
            for (int i = 0; i < rest; i++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}
