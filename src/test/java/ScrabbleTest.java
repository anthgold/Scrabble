import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.scrabbleScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.scrabbleScore("d"));
  }


}
