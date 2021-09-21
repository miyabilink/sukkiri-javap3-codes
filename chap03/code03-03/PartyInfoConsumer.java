import java.util.Set;

@FunctionalInterface
public interface PartyInfoConsumer {
  public abstract void process(Set<Hero> party, Hero leader, String pName);
}
