/**
 * Object to represent a Team in the World Cup
 */
public class Team {
    //Data fields parsed from JSON
    private String name;
    private String code;

    //Auto generated getter methods

    /**
     * Returns the team name or country
     *
     * @return the team name or country
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the 3 character team code
     *
     * @return the 3 character team code
     */
    public String getCode() {
        return code;
    }
}
