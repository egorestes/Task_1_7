package com.company;

public class Main {

    public static void main(String[] args) {
        MyRandom rnd = new MyRandom();
        // Кол-во сгенерированных не повторяющихся чисел от одного начального вектора
        int n = rnd.NextInt();
        int count = 1;
        while(rnd.NextInt() != n) {
            count++;
        }
        System.out.println("Number of unique numbers: " + count);

        // Сгенерируем массив чисел в диапазоне [-100:100]
        gen(rnd);

        // Изменим начальный seed
        rnd.setSeed(195);
        System.out.println();

        // Сгенерируем массив чисел в диапазоне [-100:100]
        gen(rnd);
    }

    private static void gen(MyRandom rnd) {
        int[] arr = new int[50];
        for(int i = 0; i < 50; i++) {
            arr[i] = rnd.NextInt(100);
            System.out.print("N" + (i + 1) + ": " + arr[i] + "; \t");
            if(i % 10 == 9) System.out.println();
        }
    }
}
