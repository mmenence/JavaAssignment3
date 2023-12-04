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
        int colourTableInput = 3;
        int[] powerArray = {2,4,8,16,32,64,128,256,512,1024};
        ColourTable colourTable = new ColourTable(colourTableInput);

        Assertions.assertTrue( Arrays.asList(powerArray).contains(colourTable.noOfPalleteColours) && colourTable.noOfPalleteColours < 1025, "Input is not a power of tow or is greater than 1204");

    }
}
