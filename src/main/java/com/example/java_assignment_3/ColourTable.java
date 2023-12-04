package com.example.java_assignment_3;


public class ColourTable {


    public int noOfPalleteColours;

    /**
     * Constructor class for the class ColourTable
     *
     * @param noOfColours the number of colours allowed to be in the palette (specifies the number of elements allowed in the colour lookup table), must be a power of two and below 1025.
     */
    public ColourTable(int noOfColours) throws Exception {

        int[] powerArray = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        for (int i = 0; i < powerArray.length; i++) {
            if (powerArray[i] == noOfColours) {
                break;
            }
            throw new Exception("input not a valid number");
        }
        noOfPalleteColours = noOfColours;



    }
}
