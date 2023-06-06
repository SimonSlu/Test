package Lesson8;

public class Task1 {
    String name;
    int i;

    public static void main(String[] args) {
        Task1 First = new Task1("Sema");
        int chet = 0;
        int nechet = 0;

        for (First.i += 1; First.i <= 100; First.plus()){
            if (First.i % 2 == 0){
                chet++;
            } else nechet++;
        }
        System.out.printf("Chetni = %d Nechet = %d", chet, nechet);
    }

    Task1 (String name, int i){
        this.name = name;
        this.i = i;
    }
    Task1 (String name){
        this.name = name;
        this.i = 0;
    }
    public int plus(){
        return this.i++;
    }
    public int minus(){
        return this.i--;
    }
    public int plus(int j){
        return this.i += j;
    }
    public int minus(int j){
        return this.i -=j;
    }
}
