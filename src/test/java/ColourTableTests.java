import com.example.java_assignment_3.ColourTable;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ColourTableTests {
    @Test
    public void ColourTable() throws Exception {


        int colourTableInput = 2;
        int expectedOutput = 2;
        ColourTable colourTable = new ColourTable(colourTableInput);
        Assertions.assertEquals(expectedOutput, colourTable.noOfPaletteColours, 0, "input and number of colours allowed in palette are not equal");
        //Assertions.assertTrue(Math.pow(colourTable.noOfPalleteColours, 2) % 1  == 0 && colourTable.noOfPalleteColours < 1025, "input and number of colours allowed in palette are not equal");
    }

    @Test
    public void ColourTableInputRestrictionTests() throws Exception {
        int colourTableInput = 8;
        ColourTable colourTable = new ColourTable(colourTableInput);

        Assertions.assertTrue( colourTableInput == colourTable.noOfPaletteColours && colourTable.noOfPaletteColours < 1025, "Input is not a power of two or is greater than 1204");

    }

    @Test
    public void ColourTableAddColourTest() throws Exception {

        int colourTableInput = 4;
        ColourTable colourTable = new ColourTable(colourTableInput);
        colourTable.AddColour(124, 32, 54);
        Assertions.assertEquals(colourTable.PaletteColours.get(0), Color.rgb(124,32,54), "Colour in table does not match the iputs given");

    }
}

