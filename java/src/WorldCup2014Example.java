public class WorldCup2014Example {

    public static void main(String[] args) {
        WorldCup worldCup = JSONParser.parseDataFromFilePath("C:\\Users\\micha\\SummerProjects2018\\WorldCupJSONParser\\res\\worldcup2014json");

        //Will print "World Cup 2014"
        System.out.println(worldCup.getName());

        //An array of all the rounds in the world cup
        Round[] rounds = worldCup.getRounds();

        //Will print "BRA"
        System.out.println(rounds[0].getMatches()[0].getWinner().getCode());

        //The final match of the 2014 World Cup
        Match championship = rounds[rounds.length - 1].getMatches()[0];

        //Will print " Mario Gotze"
        System.out.println(championship.getGameWinningGoal().getName());


    }
}
