package caesar.cypher;

public class CaesarsCypher {
  private static final String DEFAULT_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

  private final String alphabet;
  private final int offset;

  CaesarsCypher(int offset) {
    this(offset, DEFAULT_ALPHABET);
  }

  CaesarsCypher(int offset, String alphabet) {
    this.offset = offset;
    this.alphabet = alphabet;
  }

  public String encrypt(String input) {
    return input
      .codePoints()
      .map(ch -> {
        final int idx = alphabet.indexOf(ch);
        if (idx == -1) return ch; // Not found, keep same

        final int newIdx = (idx + offset) % alphabet.length();
        return alphabet.codePointAt(newIdx);
      })
      .collect(
          StringBuilder::new,
          StringBuilder::appendCodePoint,
          StringBuilder::append
      ).toString();
  }
}
