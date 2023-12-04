package com.example.java_assignment_3;


import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class ColourTable {


    public int noOfPaletteColours;
    public List<Color> PaletteColours;

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
            else if (i == powerArray.length - 1) {
                throw new Exception("input not a valid number");
            }
        }
        noOfPaletteColours = noOfColours;

        PaletteColours = new ArrayList<>(noOfPaletteColours);

    }


    /**
     * Class to add a colour to the colour palette, added as three ints between 0 and 255 signifying RGB values
     * added to Array as "Color" object
     *
     * @param redValue An integer between 0 and 255 representing the red value in the colour
     * @param greenValue An integer between 0 and 255 representing the green value in the colour
     * @param blueValue An integer between 0 and 255 representing the blue value in the colour
     */
    public void AddColour(int redValue, int greenValue, int blueValue) throws Exception {

        if (PaletteColours.size() >= noOfPaletteColours){
            throw new Exception("No more room in the palette for another colour");
        }

        if (redValue >255 || redValue < 0 || greenValue >255 || greenValue < 0 || blueValue >255 || blueValue < 0){
            throw new Exception("Input variables out of bounds");
        }
        Color addedColour = Color.rgb (redValue,greenValue,blueValue);
        PaletteColours.add(addedColour);
    }
}
