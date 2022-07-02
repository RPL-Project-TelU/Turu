/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tklate file, choose Tools | Tklates
 * and open the tklate in the editor.
 */
package GUI;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonArray;

/**
 *
 * @author Dewa
 */
public class kuisJSon {
    
    public static void main(String arg[]){
            JSONParser parser = new JSONParser();
            
        try
        {
            Object obj = parser.parse (new FileReader("kuisjson.json"));
            JSONArray kList = (JsonArray) obj;
            //String firstname = (String) jsonObject.get("firstName");
            //System.out.println("firstname : " +firstname);
            /*JSONArray coursesArray = (JSONArray) jsonObject.get("soal");
            Iterator<String> iterator = coursesArray.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
            //kList.forEach(k -> parsekObj((JSONObject)k));
        }
        catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        //catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}
        
    }
    private static void parsekObj(JSONObject k, ArrayList<Soal> arraySoal){
        JSONObject kObj = (JSONObject) k.get("soal");
        String noSoal = (String) kObj.get("noSoal");
        String soal = (String) kObj.get("soal");
        List<String> arrayPilihan = (List<String>) kObj.get("pilihan");
        String benar = (String) kObj.get("benar");
        /*System.out.print(noSoal);
        System.out.println(" "+soal);
        Iterator<String> iterator = arrayPilihan.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        Soal unitSoal = new Soal(noSoal, soal, arrayPilihan, benar);
        //List<Object> unitSoal = Arrays.asList(noSoal, soal, arrayPilihan);
        arraySoal.add(unitSoal);

    }
    public static ArrayList<Soal> ambilKuisJSON(String filePath){
        ArrayList<Soal> arrayKuis = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse (new FileReader(filePath));
            JSONArray kList = (JSONArray) obj;
            //String firstname = (String) jsonObject.get("firstName");
            //System.out.println("firstname : " +firstname);
            /*JSONArray coursesArray = (JSONArray) jsonObject.get("soal");
            Iterator<String> iterator = coursesArray.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
            kList.forEach(k -> parsekObj((JSONObject)k, arrayKuis));
        }
        catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        //catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}
        return arrayKuis;
    }
    
}
