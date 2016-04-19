import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
// import static spark.Spark.*;

public class Scrabble {
  public static Integer scrabbleScore (String word) {
    Map<String, Integer> scoreMap = new HashMap<String, Integer>();
    scoreMap.put("a", 1);

    Integer score = 0;

        if (key.contains(letter)) {
          score += scoreMap.get(key);
        }
    }

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
