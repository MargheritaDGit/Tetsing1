import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;



class MainTest {

    Main main =  new Main (); //istanza



    @Test
    void printSum() {
        int risultato = main.printSum(40, 50);
        assertEquals(90, risultato);
    }

    @Test
    void printChar() {
        char risultato = main.printChar('c');
        assertEquals('c', risultato);
    }

    @Test
    void printSumInteger() {
    }

    @Test
    void printCharacter() {
    }
}
