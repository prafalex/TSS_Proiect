package unibuc.TSS_Proiect;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestsEquivalencePartitioning {
    @Test
    public void testEquivalencePartitionC1() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(30103);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("DA",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testEquivalencePartitionC2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15151);
        numbers.add(16361);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("DA, DA",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testEquivalencePartitionC3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15151);
        numbers.add(16361);
        numbers.add(1001);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("DA, DA, DA",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testEquivalencePartitionC4() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        assertFalse(TssProiectApplication.isValidList(numbers));
        assertFalse(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("Conditii neindeplinite", TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testEquivalencePartitionC5() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15151);
        numbers.add(16361);
        numbers.add(12);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("Conditie partial indeplinita", TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testEquivalencePartitionC6() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15151);
        numbers.add(18345);
        numbers.add(12);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("Conditie partial indeplinita", TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void testEquivalencePartitionC7() {
        String numbers = "12da asd";
        System.setIn(new java.io.ByteArrayInputStream(numbers.getBytes()));
        assertThrows(InvalidInputException.class, () -> TssProiectApplication.main(null));
    }
}
