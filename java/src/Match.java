import java.util.Date;

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

    /**
     * Returns a Date object representing the date of the match
     *
     * @return a Date object representing the date of the match
     */
    public Date getDateAndTime() {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, time.length()));

        return new Date(year, month, day, hour, minute);
    }

    /**
     * Calculates the goal differential of the match for a given team
     *
     * @param team - the team to calculate goal differential for
     * @return the goal differential of the given team, 404 if the team did not play in the match
     */
    public int getGoalDifferential(Team team) {
        if (team1.equals(team)) {
            return score1 - score2;
        } else if (team2.equals(team)) {
            return score2 - score1;
        } else {
            return 404;
        }
    }

    /**
     * Calculates the points gained from the given team
     *
     * @param team the team to calculate points for
     * @return the points gained by the given team
     */
    public int getPoints(Team team) {
        if (team.equals(getWinner())) {
            return 3;
        } else if (team.equals(getLoser())) {
            return 0;
        } else {
            return 1;
        }
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
