package ch.st.datacollector.json;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by Phong6698 on 15.05.2016.
 * Class for loading json file and getting as String
 */
public class JsonLoader {

    private InputStream inputStream = null;

    public String getJsonString(String url){
        String jsonString = null;
        openInputStream(url);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            jsonString = readAll(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeInputStream();
        }
        return jsonString;
    }

    private void openInputStream(String url){
        try {
            inputStream = new URL(url).openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeInputStream(){
        if(inputStream!=null){
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String readAll(Reader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int cp;
        while ((cp = reader.read()) != -1) {
            stringBuilder.append((char) cp);
        }
        return stringBuilder.toString();
    }
}
