import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalToBinaryTest {

    @Test
    public void convert() {
        DecimalToBinary converter = new DecimalToBinary();
        String actual = converter.convert(10);
        assertEquals(actual,"1010");
    }
}