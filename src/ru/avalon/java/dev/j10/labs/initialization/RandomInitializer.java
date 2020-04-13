package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

public class RandomInitializer implements Initializer {
    int rangeRand;
    
    public RandomInitializer(int rangeRand){
        this.rangeRand=rangeRand;
    }

    public void initialize(int[] array) {
        Random rand = new Random();
        for (int i=0; i<array.length; i++){
            array[i]=rand.nextInt(rangeRand*2)-(rangeRand-1);
        }
    }
}
