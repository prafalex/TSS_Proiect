package unibuc.TSS_Proiect;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestsCauseEffectGraphing {
    @Test
    public void TestsCauseEffectGraphingE4() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15151);
        numbers.add(16361);
        numbers.add(1001);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("DA, DA, DA",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void TestsCauseEffectGraphingE3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15123);
        numbers.add(16123);
        numbers.add(17123);
        assertTrue(TssProiectApplication.isValidList(numbers));
        assertTrue(TssProiectApplication.hasSumGreater(numbers));
        assertEquals("Conditie partial indeplinita",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void TestsCauseEffectGraphingE2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        assertFalse(TssProiectApplication.isValidList(numbers));
        assertEquals("Conditii neindeplinite",TssProiectApplication.checkNumbers(numbers));
    }

    @Test
    public void TestsCauseEffectGraphingE1() {
        String numbers = "1abc 2";
        System.setIn(new java.io.ByteArrayInputStream(numbers.getBytes()));
        assertThrows(InvalidInputException.class, () -> TssProiectApplication.main(null));
    }
}
