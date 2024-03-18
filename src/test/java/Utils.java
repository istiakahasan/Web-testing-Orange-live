import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.FileWriter;

public class Utils {
    public static void doScroll(WebDriver driver, int firstpos, int lastpos) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + firstpos + "," + lastpos + ")");

    }

    public static  void saveUsers(String firstName, String lastName, String username, String password) {
        String fileLocation = "./src/test/resources/test.xml";
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray=(JSONArray) jsonParser.parse(new FileReader(fileLocation));
        JSONObject userObj=new JSONObject();
        userObj.put("firstName",firstName);
        userObj.put("lastName",lastName);
        userObj.put("username",username);
        userObj.put("password",password);

        jsonArray.add(userObj);
        FileWriter writer=new FileWriter(fileLocation);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();
    }
    public void getUser(){
        String fileLocation = "./src/test/resources/test.xml";
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray=(JSONArray) jsonParser.parse(new FileReader(fileLocation));
        JSONObject empobj=(JSONObject) jsonArray.get(jsonArrray.size()-)
    }
}