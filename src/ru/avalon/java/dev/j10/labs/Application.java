package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.sort.*;
import ru.avalon.java.dev.j10.labs.initialization.*;


public class Application {

    public static void main(String[] args) {
        int[] array = new int[20];
        /*rangeRand - задает диапазона выборки случайных чисел, указанное число откладывается
        от нуля как в положительную сторону на заданное число, так и в отрицательную*/
        int rangeRand = 50;

        System.out.println("--------Числа Фибоначчи--------");
        new FibonacciInitializer().initialize(array);
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Сумма чисел Фибрначчи = " + summArray(array));

        System.out.println("");
        System.out.println("--------Пузырьковая сортировка--------");
        new RandomInitializer(rangeRand).initialize(array);
        System.out.println("Не сортированный массив");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Сортированный массив");
        new BubbleSort().sort(array);
        for (int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("--------Сортировка Шелла--------");
        new RandomInitializer(rangeRand).initialize(array);
        System.out.println("Не сортированный массив");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Сортированный массив");
        new ShellSort().sort(array);
        for (int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("--------Сортировка выборкой--------");
        new RandomInitializer(rangeRand).initialize(array);
        System.out.println("Не сортированный массив");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Сортированный массив");
        new SelectionSort().sort(array);
        for (int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    //Метод для суммирования чисел массива
    private static int summArray (int[] array){
        int summArray=0;
        for(int i=0; i<array.length; i++){
            summArray+=array[i];
        }
        return summArray;
    }
}
