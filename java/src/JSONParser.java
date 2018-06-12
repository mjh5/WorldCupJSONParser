import com.google.gson.Gson;

public class JSONParser {

    //Gson object for parsing JSON
    private static Gson gson = new Gson();

    /**
     * Parses a Layout object from a JSON String
     *
     * @param layoutJSON - String JSON file to be parsed
     * @return - a layout object containing the data from JSON
     */
    public static JSONLayout parseLayout(String layoutJSON) {
        return gson.fromJson(layoutJSON, JSONLayout.class);
    }

    /**
     * Parses a Layout object from a JSON file
     *
     * @param filePath - a path to the JSON file to parse
     * @return - a layout object containing the data from JSON
     */
    public static JSONLayout parseLayoutFromFilePath(String filePath) {
        //TODO: Write this method and corresponding test method
        return null;
    }
}
