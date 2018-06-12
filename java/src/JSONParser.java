import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

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
     * Parses a Layout object a web page
     *
     * @param urlString - the string url from the web page
     * @return - a Layout object containing the data from the web page
     */
    public static JSONLayout parseLayoutFromURL(String urlString) {
        try {
            //Retrieve JSON String from the
            String url = urlString;
            HttpResponse<String> stringHttpResponse = Unirest.get(url).asString();
            String jsonFromURL = stringHttpResponse.getBody();

            return parseLayout(jsonFromURL);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return null;
        }
    }

    public static JSONLayout parseLayoutFromFilePath(String filePath) {
        //TODO: Write this method and corresponding test method
        return null;
    }
}
