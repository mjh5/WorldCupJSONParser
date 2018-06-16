import java.util.Objects;

/**
 * Object to represent a Team in the World Cup
 */
public class Team {
    //Data fields parsed from JSON
    private String name;
    private String code;



    //Auto generated methods

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) &&
                Objects.equals(code, team.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, code);
    }
}
