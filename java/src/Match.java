/**
 * Object representing an individual World Cup match
 */
public class Match {
    //Data fields parsed from JSON
    private int num;
    private String date;
    private String time;
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;
    private Goal[] goals;
    private String group;
    private Stadium stadium;
    private String city;
    private String timezone;

    /**
     * Return the winning team
     *
     * @return the winning team, null if draw
     */
    public Team getWinner() {
        if (score1 > score2) {
            return team1;
        } else if (score1 < score2) {
            return team2;
        } else {
            return null;
        }
    }

    /**
     * Returns the losing team
     *
     * @return the losing team, null if draw
     */
    public Team getLoser() {
        if (score1 > score2) {
            return team2;
        } else if (score1 < score2) {
            return team1;
        } else {
            return null;
        }
    }

    /**
     * Returns the game winning goal
     *
     * @return the game winning goal, null if no goals were scored
     */
    public Goal getGameWinningGoal() {
        if (goals.length == 0) {
            return null;
        }

        return goals[goals.length - 1];
    }

    //Auto generated getter methods

    /**
     * Returns the match number
     *
     * @return the match number
     */
    public int getNum() {
        return num;
    }

    /**
     * Returns the date of the match
     *
     * @return the date of the match
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns the start time of the match
     *
     * @return the start time of the match
     */
    public String getTime() {
        return time;
    }

    /**
     * Returns the home team of the match
     *
     * @return the home team of the match
     */
    public Team getTeam1() {
        return team1;
    }

    /**
     * Returns the away team of the match
     *
     * @return the away team of the match
     */
    public Team getTeam2() {
        return team2;
    }

    /**
     * Returns the home score of the match
     *
     * @return the home score
     */
    public int getScore1() {
        return score1;
    }

    /**
     * Returns the away score of the match
     *
     * @return the away score
     */
    public int getScore2() {
        return score2;
    }

    /**
     * Returns an array of the goals scored in the match
     *
     * @return an array of the goals scored in the match
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * Returns the group of the two teams
     *
     * @return the group of the two teams
     */
    public String getGroup() {
        return group;
    }

    /**
     * Returns the stadium the match was played in
     *
     * @return the stadium the match was played in
     */
    public Stadium getStadium() {
        return stadium;
    }

    /**
     * Return the city the match was played in
     *
     * @return the city the match was played in
     */
    public String getCity() {
        return city;
    }

    /**
     * Return the time zone the match was played in
     *
     * @return the time zone the match was played in
     */
    public String getTimezone() {
        return timezone;
    }
}
