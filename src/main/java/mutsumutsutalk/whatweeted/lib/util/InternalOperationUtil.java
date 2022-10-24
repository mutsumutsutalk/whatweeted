package mutsumutsutalk.whatweeted.lib.util;

import java.util.concurrent.ThreadFactory;
import javax.annotation.Nonnull;
import mutsumutsutalk.whatweeted.lib.concurrent.CountingThreadFactory;

/**
 * Util class for internal operations.
 * <p>
 * these util methods will not be used for end user's operation.
 *
 * @author Ranfa
 * @version 0.0.1-SNAPSHOT
 */
public class InternalOperationUtil {

  // Honor to the JVM
  private InternalOperationUtil() { /* do nothing */ }

  /**
   * creates a new {@link ThreadFactory} with default parameter.
   *
   * @return new {@link ThreadFactory} instance
   */
  @Nonnull
  public static ThreadFactory createDefaultThreadFactory() {
    return new CountingThreadFactory();
  }

  /**
   * creates a new {@link ThreadFactory} with specifier
   * <p>
   * The threads that will create by this method will be daemon thread.
   *
   * @param specifier String what to do.
   * @return new {@link ThreadFactory} instance
   */
  @Nonnull
  public static ThreadFactory createThreadFactory(String specifier) {
    return new CountingThreadFactory(() -> "Whatweeted", specifier);
  }

  /**
   * creates a new {@link ThreadFactory} with specifier and daemon status
   *
   * @param specifier String what to do.
   * @param isDaemon  daemon status
   * @return new {@link ThreadFactory} instance
   */
  @Nonnull
  public static ThreadFactory createThreadFactory(String specifier, boolean isDaemon) {
    return new CountingThreadFactory(() -> "Whatweeted", specifier, isDaemon);
  }

}
