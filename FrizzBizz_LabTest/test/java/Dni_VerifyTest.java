import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dni_VerifyTest {

    @Test
    @DisplayName("Put your DNI")
    void verifyDni() {
        assertAll(() -> assertEquals("No Valido", Dni_Verify.verifyDni("x1234567x")),
              () -> assertEquals("valido", Dni_Verify.verifyDni("12345678Z")));
    }
}