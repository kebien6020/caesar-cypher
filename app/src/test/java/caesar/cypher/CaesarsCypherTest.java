package caesar.cypher;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarsCypherTest {
  @Test public void testCypherHello() {
    var cypher = new CaesarsCypher(12);
    assertEquals("tqxxa", cypher.encrypt("hello"));
  }

  @Test public void testLongerMessageOffset12() {
    var cypher = new CaesarsCypher(12);
    assertEquals("tai mdq kag pauzs fapmk", cypher.encrypt("how are you doing today"));
  }

  @Test public void testEmptyString() {
    var cypher = new CaesarsCypher(4);
    assertEquals("", cypher.encrypt(""));
  }
}
