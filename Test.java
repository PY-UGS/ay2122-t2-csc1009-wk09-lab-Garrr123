import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class Test {
    RandomCharacter random;
    boolean result;
    @BeforeEach
    void setUp(){
        random = new RandomCharacter();
    }

    @org.junit.jupiter.api.Test
    public void getRandomLowerCaseLetter() {
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomLowerCaseLetter();
            System.out.println("LowerCase Letter is  : "  + letter);
            assertTrue(letter <= 'z' && letter >= 'a');
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomUpperCaseLetter() {
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomUpperCaseLetter();
            System.out.println("Uppercase Letter is  : "  + letter);
            assertTrue(letter <= 'Z' && letter >= 'A');
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomDigitCharacter() {
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomDigitCharacter();
            System.out.println("Random digit Characters is  : "  + letter);
            assertTrue(letter <= '9' && letter >= '0');
        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomPrimeDigitCharacter() {
        for (int i = 0; i < 15; i++){
            int digit = random.getRandomPrimeNumber();
            System.out.println("Random Prime Number is  : "  + digit);
            assertTrue(random.isPrime(digit));

        }
    }

    @org.junit.jupiter.api.Test
    public void getRandomCharacter() {
        for (int i = 0; i < 15; i++){
            char letter = random.getRandomCharacter();
            System.out.println("Random Character is  : "  + letter);
            assertTrue(letter <= 125 && letter >= 33);

        }
    }
}