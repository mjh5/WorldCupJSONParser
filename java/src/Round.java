/**
 * Round class to represent a single round of the World Cup
 */
public class Round {
    //Data fields parsed from JSON
    private String name;
    private Match[] matches;

    //Auto generated getter methods

    /**
     * Returns the round name
     *
     * @return the round name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns and array of the matches in the round of the World Cup
     *
     * @return an array of the matches in the round of the World Cup
     */
    public Match[] getMatches() {
        return matches;
    }
}
