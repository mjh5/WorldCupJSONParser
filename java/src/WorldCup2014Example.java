public class WorldCup2014Example {

    public static void main(String[] args) {
        WorldCup worldCup = JSONParser.parseData("../../res/worldcup2014.json");

        System.out.println(worldCup.getName());
    }
}
