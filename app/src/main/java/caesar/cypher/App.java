package caesar.cypher;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    final var message = Arrays.stream(args).findFirst().orElse("Hello");
    final var cypher = new CaesarsCypher(12);

    System.out.println("Message: " + message);
    System.out.println("Encrypted: " + cypher.encrypt(message));
  }
}
