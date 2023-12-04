package com.example.java_assignment_3;
import java.util.Arrays;

public class ColourTable {


    public int noOfPalleteColours;

    /**
     * Constructor class for the class ColourTable
     *
     * @param noOfColours the number of colours allowed to be in the palette (specifies the number of elements allowed in the colour lookup table), must be a power of two and below 1025. if input does not obey these rules, will take largest smaller valid input as input instead
     */
    public ColourTable(int noOfColours) {

        int[] powerArray = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        if (noOfColours < 2){
            noOfPalleteColours = 2;
        }
        else {
            for (int i = 0; i < powerArray.length; i++) {
                if (powerArray[i] <= noOfColours) {
                    noOfPalleteColours = powerArray[i];
                }
            }

        }

    }
}
