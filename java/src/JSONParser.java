import com.google.gson.Gson;

import java.io.File;
import java.util.Scanner;

/**
 * Static class to parse JSON data into WorldCup Objects
 */
public class JSONParser {

    //Gson object for parsing JSON
    private static Gson gson = new Gson();

    /**
     * Parses a Layout object from a JSON String
     *
     * @param layoutJSON String JSON file to be parsed
     * @return a layout object containing the data from JSON
     */
    public static WorldCup parseData(String layoutJSON) {
        return gson.fromJson(layoutJSON, WorldCup.class);
    }

    /**
     * Parses a Layout object from a JSON file
     *
     * @param filePath a path to the JSON file to parse
     * @return a layout object containing the data from JSON
     */
    public static WorldCup parseDataFromFilePath(String filePath) {
        File fileToParse = new File(filePath);
        try {
            Scanner fileReader = new Scanner(fileToParse);
            String jsonString = getFileAsString(fileReader);
            return parseData(jsonString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    /**
     * Helper method to read a given file into a String object
     *
     * @param fileReader Scanner object to read file
     * @return the contents of the file as a String
     */
    private static String getFileAsString(Scanner fileReader) {
        StringBuilder fileAsString = new StringBuilder();
        while (fileReader.hasNextLine())
            fileAsString.append(fileReader.nextLine());
        return fileAsString.toString();
    }
}
