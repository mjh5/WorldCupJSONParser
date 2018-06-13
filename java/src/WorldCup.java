/**
 * WorldCup class containing World Cup data parsed from football.db world cup statistics
 */
public class WorldCup {
    //Data fields parsed from JSON
    private String name;
    private Round[] rounds;

    //Auto generated getter methods

    /**
     * Returns the name of the World Cup
     *
     * @return name of the World Cup
     */
    public String getName() {
        return name;
    }

    /**
     * Returns an array of the rounds of the World Cup
     *
     * @return Array of round objects
     */
    public Round[] getRounds() {
        return rounds;
    }
}
