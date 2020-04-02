package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

public class FibonacciInitializer implements Initializer {

    public void initialize(int[] array) {
        //Инициализация массива, размером в одну или две переменные
        if (array.length>2){
            array[0]=0;
            array[1]=1;
        }else if (array.length==1){array[0]=0;}
        //Инициализация массива, размером более двух переменных
        for (int i=2; i<array.length; i++){
            array[i]=array[i-1]+array[i-2];
        }
    }
}
