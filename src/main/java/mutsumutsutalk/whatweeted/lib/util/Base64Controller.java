package mutsumutsutalk.whatweeted.lib.util;

import java.util.Base64;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Base64Controller {

  private Base64Controller() { /* do nothing */ }

  /**
   * decode the specified string.
   *
   * @param val string to decode.
   * @return decoded string.
   */
  public static String decodeBase64(String val) {
    return new String(Base64.getDecoder().decode(val));
  }
}
