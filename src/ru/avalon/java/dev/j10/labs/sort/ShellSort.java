package ru.avalon.java.dev.j10.labs.sort;
import ru.avalon.java.dev.j10.labs.Sort;

public class ShellSort implements Sort {

    public void sort(int[] array) {

        int d = array.length; // переменная для определения шага движения
        int backward;
        while (d>0){
            d/=2; // уменьшаем шаг движения на двое с каждой итерацией цикла while
            //Сортируем числа удаленные друг от друга на шаг d
            for (int i=0; i+d<array.length;++i){
                // Производим проверку чисел ввигаясь вперед
                if (array[i]>array[i+d]){
                    array[i] = array[i] + array[i+d];
                    array[i+d] = array[i] - array[i+d];
                    array[i] = array[i]-array[i+d];
                }
                backward=i;
                if (backward-d>=0){
                    while (array[backward]<array[backward-d]){
                        array[backward] = array[backward] + array[backward-d];
                        array[backward-d] = array[backward] - array[backward-d];
                        array[backward] = array[backward]-array[backward-d];
                        backward--;
                    }//end while
                }//end if
            }//end for
        }//end while
    }// end sort
}
