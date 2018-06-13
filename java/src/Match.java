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

    //Auto generated getter methods

    public int getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public String getGroup() {
        return group;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public String getCity() {
        return city;
    }

    public String getTimezone() {
        return timezone;
    }
}
