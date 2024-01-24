package unibuc.TSS_Proiect;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsBoundaryValueAnalysis {
    @Test
    public void testBoundaryValueC1() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(30103);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("DA",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testBoundaryValueC2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12321);
        numbers.add(8777);
        numbers.add(9015);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("Conditie partial indeplinita",TssProiectApplication.checkNumbers(numbers));
    }

}
