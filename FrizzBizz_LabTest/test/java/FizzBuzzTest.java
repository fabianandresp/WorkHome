import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Add a number")
    void verifyFizz() {
        assertAll(() -> assertEquals("Fizz", FizzBuzz.verifyFizz(3)),
                () -> assertEquals("Buzz", FizzBuzz.verifyFizz(5)),
                () -> assertEquals("Buzz", FizzBuzz.verifyFizz(10)),
                () -> assertEquals("FizzBuzz", FizzBuzz.verifyFizz(30)),
                () -> assertEquals( "FizzBuzz", FizzBuzz.verifyFizz(15)));

     }
}
