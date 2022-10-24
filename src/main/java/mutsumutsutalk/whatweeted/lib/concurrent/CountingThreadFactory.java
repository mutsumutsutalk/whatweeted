package mutsumutsutalk.whatweeted.lib.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import javax.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;

/**
 * Provides an original implmentation for {@link ThreadFactory}.
 * <p>
 * This factory will make another thread with count.
 *
 * @author Ranfa
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
public class CountingThreadFactory implements ThreadFactory {

  private static final Supplier<String> DEFAULT_LAZY_IDENTIFIER = () -> "Whatweeted";
  private static final Supplier<String> DEFAULT_LAZY_SPECIFIER = () -> "default";

  private final AtomicLong count = new AtomicLong(0);
  private final Supplier<String> identifier;
  private final boolean isDaemon;

  /**
   * creates a new instance with default information.
   * <p>
   * The thread created by this instance will be daemon thread.
   */
  public CountingThreadFactory() {
    this(DEFAULT_LAZY_IDENTIFIER, DEFAULT_LAZY_SPECIFIER.get());
  }

  /**
   * creates a new instance with specified identifier and specifier.
   * <p>
   * The thread created by this instance will be daemon thread.
   *
   * @param identifier String that indicates what belongs.
   * @param specifier  String that specifies what to do.
   */
  public CountingThreadFactory(Supplier<String> identifier, String specifier) {
    this(identifier, specifier, true);
  }

  /**
   * creates a new instance with specified identifier, specifier, and daemon status.
   *
   * @param identifier String that indicates what belongs.
   * @param specifier  String that specifies what to do.
   * @param isDaemon   the daemon status that will affect creating threads.
   */
  public CountingThreadFactory(Supplier<String> identifier, String specifier, boolean isDaemon) {
    this.identifier = () -> identifier.get() + " " + specifier;
    this.isDaemon = isDaemon;
  }

  @Override
  public Thread newThread(@Nonnull Runnable r) {
    final Thread t = new Thread(r, this.identifier.get() + "-Worker " + count.incrementAndGet());
    t.setDaemon(this.isDaemon);
    return t;
  }

}
