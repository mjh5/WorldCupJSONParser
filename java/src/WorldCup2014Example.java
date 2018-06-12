public class WorldCup2014Example {

    public static void main(String[] args) {
        WorldCup worldCup = JSONParser.parseDataFromFilePath("C:\\Users\\micha\\SummerProjects2018\\WorldCupJSONParser\\res\\worldcup2014json");

        System.out.println(worldCup.getName());
    }
}
