/**
 * Object representing a goal scored in the World Cup
 */
public class Goal {
    //Data fields parsed from JSON
    private String name;
    private Team team;
    private int minute;
    private int score1;
    private int score2;
    private boolean owngoal;

    //Auto generated getter methods

    /**
     * Returns the name of the goal scorer
     *
     * @return the name of the goal scorer
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the team of the goal scorer
     *
     * @return the team of the goal scorer
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Returns the in game time of the goal
     *
     * @return the in game time of the goal
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Returns the home team score after the goal
     *
     * @return the home team score after the goal
     */
    public int getScore1() {
        return score1;
    }

    /**
     * Returns the away team score after the goal
     *
     * @return the away team score after the goal
     */
    public int getScore2() {
        return score2;
    }

    /**
     * Return true if the goal was an own goal, false otherwise
     *
     * @return true if the goal was an own goal, false otherwise
     */
    public boolean isOwngoal() {
        return owngoal;
    }
}
