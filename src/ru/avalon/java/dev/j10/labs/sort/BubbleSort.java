package ru.avalon.java.dev.j10.labs.sort;
import ru.avalon.java.dev.j10.labs.Sort;

public class BubbleSort implements Sort {

    public void sort(int[] array) {
        int meter=array.length;// переменная для подсчета количества перемещений чисел за одну итерацию цикла while
        while (meter>0){ // если meter=0, то массив считается отсортированным
            for (int i=1; i<array.length; ++i){
               if (array[i-1]>array[i]){
                    array[i-1] = array[i-1] + array[i];
                    array[i] = array[i-1] - array[i];
                    array[i-1] = array[i-1]-array[i];
                }
            }
            meter--;
        }
    }
}
