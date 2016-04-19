import java.io.Console;
import java.util.ArrayList;
import java.util.*;

// import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
    //ui code will go here.
  }

  public static Integer scrabbleScore (String word) {
    Map<String, Integer> scoreMap = new HashMap<String, Integer>();
    scoreMap.put("a", 1);
    scoreMap.put("b", 3);
    scoreMap.put("c", 3);
    scoreMap.put("d", 2);
    scoreMap.put("e", 1);
    scoreMap.put("f", 4);
    scoreMap.put("g", 2);
    scoreMap.put("h", 4);
    scoreMap.put("i", 1);
    scoreMap.put("j", 8);
    scoreMap.put("k", 5);
    scoreMap.put("l", 1);
    scoreMap.put("m", 3);
    scoreMap.put("n", 1);
    scoreMap.put("o", 1);
    scoreMap.put("p", 3);
    scoreMap.put("q", 10);
    scoreMap.put("r", 1);
    scoreMap.put("s", 1);
    scoreMap.put("t", 1);
    scoreMap.put("u", 1);
    scoreMap.put("v", 4);
    scoreMap.put("w", 4);
    scoreMap.put("x", 8);
    scoreMap.put("y", 4);
    scoreMap.put("z", 10);



    Integer score = 0;
    score += scoreMap.get(word);
    return score;
    }
  }


// import java.util.ArrayList;
//
// public class PingPong {
//   public static void main(String[] args) {
// }
//   public ArrayList<Object> runPingPong(Integer number) {
//     ArrayList<Object> results = new ArrayList<Object>();
//     for (Integer changeNumber = 1; changeNumber <= number; changeNumber++) {
//       if ( changeNumber % 15 == 0 ) {
//         results.add("pingpong");
//       } else if ( changeNumber % 3 == 0 ) {
//         results.add("ping");
//       } else if ( changeNumber % 5 == 0 ) {
//         results.add("pong");
//       } else {
//         results.add(changeNumber);
//       }
//
//     }
//     return results;
//   }
// }
