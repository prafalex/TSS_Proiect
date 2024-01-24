//package unibuc.TSS_Proiect;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class TestMutants {
//        //Mutant ne-echivalent omorat de test
//        @Test
//        public void TestsCauseEffectGraphingE4() {
//            List<Integer> numbers = new ArrayList<>();
//            numbers.add(15151);
//            numbers.add(16361);
//            numbers.add(1001);
//            assertTrue(TssProiectApplication_Mutant_2.isValidList(numbers));
//            assertTrue(TssProiectApplication_Mutant_2.hasSumGreater(numbers));
//            assertEquals("DA, DA, DA",TssProiectApplication_Mutant_2.checkNumbers(numbers));
//        }
//
//        //Mutant ne-echivalent care nu este omorat de test
//        @Test
//        public void TestsCauseEffectGraphingE4_2() {
//            List<Integer> numbers = new ArrayList<>();
//            numbers.add(15151);
//            numbers.add(16361);
//            numbers.add(1001);
//            assertTrue(TssProiectApplication_Mutant_3.isValidList(numbers));
//            assertTrue(TssProiectApplication_Mutant_3.hasSumGreater(numbers));
//            assertEquals("DA, DA, DA",TssProiectApplication_Mutant_3.checkNumbers(numbers));
//        }
//}
