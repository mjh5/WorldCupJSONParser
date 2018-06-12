public class WorldCup2014Example {

    public static void main(String[] args) {
        WorldCup worldCup = JSONParser.parseLayout("../../res/worldcup2014.json");

        System.out.println(worldCup.getName());
    }
}
