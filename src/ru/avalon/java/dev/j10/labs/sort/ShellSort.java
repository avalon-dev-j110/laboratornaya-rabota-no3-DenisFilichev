package ru.avalon.java.dev.j10.labs.sort;
import ru.avalon.java.dev.j10.labs.Sort;

public class ShellSort implements Sort {

    public void sort(int[] array) {

        int d = array.length; // переменная для определения шага движения
        while (d>0){
            d/=2; // уменьшаем шаг движения на двое с каждой итерацией цикла while
            //Сортируем числа удаленные друг от друга на шаг d пузырьковым методом
            for (int i=0; i+d<array.length;++i){
                // Производим проверку чисел ввигаясь вперед
                if (array[i]>array[i+d]){
                    array[i] = array[i] + array[i+d];
                    array[i+d] = array[i] - array[i+d];
                    array[i] = array[i]-array[i+d];
                }
                // Производим проверку чисел ввигаясь назад
                for (int backward=i+d; backward-d>=0; backward--){
                    if (array[backward]<array[backward-d]){
                    array[backward] = array[backward] + array[backward-d];
                    array[backward-d] = array[backward] - array[backward-d];
                    array[backward] = array[backward]-array[backward-d];
                }
                }
            }
        }
    }
}
