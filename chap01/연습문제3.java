package doit.java.chap01;

public class 연습문제3 {
    static int min3(int a, int b, int c, int d){
        int min = a+b+c+d;

        if(a < min){
            min = a;
        }
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        if (d< min){
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(1,2,3, -1));
    }
}

