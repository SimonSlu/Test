package Lesson7;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(massivProst(arr, 1));

    }
    public static ArrayList<Integer> massivProst(ArrayList arr, int i){
        if (i < 1) {
            System.out.println("неверное число");
            return arr;
        }
        if (arr.size() == 10){
            return arr;
        } else {
            if (i == 1){
                i++;
                massivProst(arr, i);
            } else {
                if (i == 2 || i == 3 || (i % 2 == 0 && i % 3 == 0)){
                    arr.add(i);
                    i++;
                }
            }
        }
        massivProst(arr, i);
        return arr;

    }
}
