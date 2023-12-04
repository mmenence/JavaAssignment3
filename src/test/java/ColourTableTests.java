import com.example.java_assignment_3.ColourTable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;

public class ColourTableTests {
    @Test
    public void ColourTable(){


        int colourTableInput = 2;
        int expectedOutput = 2;
        ColourTable colourTable = new ColourTable(colourTableInput);
        Assertions.assertEquals(expectedOutput, colourTable.noOfPalleteColours, 0, "input and number of colours allowed in palette are not equal");
        //Assertions.assertTrue(Math.pow(colourTable.noOfPalleteColours, 2) % 1  == 0 && colourTable.noOfPalleteColours < 1025, "input and number of colours allowed in palette are not equal");
    }

    @Test
    public void ColourTableInputRestrictionTests(){
        int colourTableInput = 5;
        ColourTable colourTable = new ColourTable(colourTableInput);

        Assertions.assertTrue( colourTableInput >= colourTable.noOfPalleteColours && colourTable.noOfPalleteColours < 1025, "Input is not a power of two or is greater than 1204");

    }
}
