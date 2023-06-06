package Test1;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длинну стороны");
        int n = scanner.nextInt();
        int [][] array = new int[n][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = 0;
            }
        }

        int right = 0;
        int left = n-1;
        int down = n-1;
        int up = 0;
        int number = 1;

        while(number <= n*n) {

            for (int i = 0; i < n; i++) {
                if (array[right][i] == 0) {
                    array[right][i] = number;
                    number++;
                }
            }
            right++;
            if (right == n || number > n*n) break;

            for (int i = 0; i < n; i++) {
                if (array[i][down] == 0) {
                    array[i][down] = number;
                    number++;
                }
            }
            down--;
            if (down < 0 || number > n*n) break;

            for (int i = n - 1; i >= 0; i--) {
                if (array[left][i] == 0) {
                    array[left][i] = number;
                    number++;
                }
            }
            left--;
            if (left < 0 || number > n*n) break;

            for (int i = n - 1; i >= 0; i--) {
                if (array[i][up] == 0) {
                    array[i][up] = number;
                    number++;
                }
            }
            up++;
            if (up == n || number > n*n) break;
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
