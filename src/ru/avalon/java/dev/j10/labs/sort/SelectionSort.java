package ru.avalon.java.dev.j10.labs.sort;
import ru.avalon.java.dev.j10.labs.Sort;

public class SelectionSort implements Sort {

    public void sort(int[] array) {
        //Алгоритм двусторонней сортировки выбором
        int maxNumber, minNumber, minIndex, maxIndex, d=array.length;
        //Перебираем массив, с каждой итерацией сокращая его с обеих сторон на один шаг
        for (int one=0; one<d; one++, d--){
            minNumber = array[one];
            maxNumber = array[d-1];
            minIndex=one;
            maxIndex=d-1;
            //находим в массиве максимальное и минимальное числа, а также запоминаем индексы переменных, ссылающихся на них
            for (int i=one; i<d; i++){
                if (array[i]>=maxNumber){
                    maxNumber=array[i];
                    maxIndex=i;
                }else if (array[i]<=minNumber){
                    minNumber=array[i];
                    minIndex=i;
                }
            }
            //меняем максимальное число местами с неотсортированной переменной, имеющей наибольший индекс
            int lastVariable = array[d-1]; // сохраняем последнюю несортированную переменную массива в отдельной переменной для проверки её неизменности
            array[minIndex] = array[one];// меняем местами первое несортированное число с минимальным числом
            array[one] = minNumber;
            if(lastVariable == array[d-1] & maxNumber == array[maxIndex]){ // проверяем неизменность значения последней несортированной переменной и максимального числа
                array[maxIndex] = array[d-1];// меняем местами последнее несортированное число с максимальным числом
                array[d-1] = maxNumber;
            }else d+=1;
        }
    }
}
