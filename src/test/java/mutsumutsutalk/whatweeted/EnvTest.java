package mutsumutsutalk.whatweeted;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EnvTest {

  @Test
  void environments() {
    // hamcrest
    assertThat(true, is(equalTo(true)));
    // junit
    assertTrue(true);
  }

}
