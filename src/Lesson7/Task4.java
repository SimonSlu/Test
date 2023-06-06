package Lesson7;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(sqrDigit(4));

    }
    public static double sqrDigit(double n){

        if (n == 1){
            return 1;
        }
        return Math.sqrt(n) + sqrDigit(n-1);
    }
}
