package doit.java.chap01;

public class 연습문제2 {
    static int min3(int a, int b, int c){
        int min = a+b+c;

        if(a < min){
            min = a;
        }
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(1,2,3));
    }
}
