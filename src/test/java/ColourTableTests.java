import com.example.java_assignment_3.ColourTable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ColourTableTests {
    @Test
    public void ColourTable(){

        int colourTableInput = 2;
        int expectedOutput = 2;

        ColourTable colourTable = new ColourTable(colourTableInput);
        Assertions.assertEquals(expectedOutput, colourTable.noOfPalleteColours);

    }
}
