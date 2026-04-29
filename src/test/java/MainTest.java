import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calculat_shouldBe3dot3_whenInputIs2and6and1dot1() {
        int a= 2;
        int b= 6;
        double c= 1.1;
        double expected= 3.3;
        double actual;

        actual= Main.calculat(a, b, c);
        assertEquals(expected, actual);
    }
}