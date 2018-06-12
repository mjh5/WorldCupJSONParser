public class Goal {
    //Data fields parsed from JSON
    String name;
    Team team;
    int minute;
    int score1;
    int score2;
    boolean owngoal;

    //Auto generated getter methods

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public int getMinute() {
        return minute;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public boolean isOwngoal() {
        return owngoal;
    }
}
