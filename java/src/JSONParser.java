import com.google.gson.Gson;

import java.io.File;
import java.util.Scanner;

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
        File fileToParse = new File(filePath);
        try {
            Scanner fileReader = new Scanner(fileToParse);
            String jsonString = getFileAsString(fileReader);
            return parseLayout(jsonString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    private static String getFileAsString(Scanner fileReader) {
        StringBuilder fileAsString = new StringBuilder();
        while (fileReader.hasNextLine())
            fileAsString.append(fileReader.nextLine());

        return "";
    }
}
