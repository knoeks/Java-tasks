
import java.util.*;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    if (aintPlayinGames()) return;
    String word = generateWord();
    guessWord(word);
  }

  public static boolean aintPlayinGames() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to play a game? yes | no");
    String answer = scanner.nextLine();
    return !answer.equals("yes");
  }

  public static String generateWord() {
    List<String> randomWords = Arrays.asList(
            "apple", "banana", "cherry", "dragonfruit", "elderberry",
            "fig", "grape", "honeydew", "kiwi", "lemon",
            "mango", "nectarine", "orange", "papaya", "quince",
            "raspberry", "strawberry", "tangerine", "ugli", "vanilla",
            "watermelon", "xigua", "yam", "zucchini"
    );

    int randomNumber = (int) Math.round(Math.random() * randomWords.size());
    return randomWords.get(randomNumber);
  }

  public static void guessWord(String word) {
    // continue while correctly guessed word or lost
    int guessesRemaining = 7;
    int guessedLetters = 0;
    int index;
    StringBuilder unknownWord = new StringBuilder("*".repeat(word.length()));

    while (guessesRemaining > 0 && guessedLetters < word.length()) {
      System.out.println(unknownWord);

      String letter = getValidInput();
      index = -1;
      boolean lostLive = true;
      int correctCount = 0;

      // uncover all same letters in word
      do {
        index = word.indexOf(letter, index + 1);
        if (index > -1 && unknownWord.charAt(index) == '*') {
          unknownWord.replace(index, index + 1, letter);
          lostLive = false;
          correctCount++;
        }
      } while (index > -1);

      if (lostLive) {
        guessesRemaining--;
        System.out.println(guessesRemaining + " lives left.");
      } else {
        System.out.println(letter + " is correct guess! you guessed: " + correctCount + " letters");
        guessedLetters += correctCount;
      }

      System.out.print("\n");
    }

    if (guessesRemaining > 0) {
      System.out.println("Congrats. You won!");
    } else {
      System.out.println("Better luck next time!");
    }
    return;
  }

  public static String getValidInput() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("input single a-Z letter:");
      String input = scanner.nextLine();

      if (input.matches("^[a-zA-Z]$")) {
        return input;
      }
      System.out.print("Invalid input. ");
    }
  }
}