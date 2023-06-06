package Lesson4;

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedi dlinu");
        int dlina = sc.nextInt();
        System.out.println("vvedi shirinu");
        int shirina = sc.nextInt();
        draw(shirina, dlina);

    }
    public static void draw(int shirina, int dlina){
        for (int i = 1; i <= shirina; i++){
            if (i == 1 || i == shirina){
                for (int j = 1; j <= dlina; j++){
                    if (j == 1 || j == dlina) System.out.print(" ");
                    else System.out.print("-");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= dlina; j++){
                    if (j == 1 || j == dlina) System.out.print("|");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
