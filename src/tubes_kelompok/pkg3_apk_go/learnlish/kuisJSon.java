/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_kelompok.pkg3_apk_go.learnlish;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
            JSONArray empList = (JSONArray) obj;
            //String firstname = (String) jsonObject.get("firstName");
            //System.out.println("firstname : " +firstname);
            /*JSONArray coursesArray = (JSONArray) jsonObject.get("soal");
            Iterator<String> iterator = coursesArray.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
            //empList.forEach(emp -> parseEmpObj((JSONObject)emp));
        }
        catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        //catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}
        
    }
    private static void parseEmpObj(JSONObject emp, ArrayList<Soal> arraySoal){
        JSONObject empObj = (JSONObject) emp.get("soal");
        String noSoal = (String) empObj.get("noSoal");
        String soal = (String) empObj.get("soal");
        List<String> arrayPilihan = (List<String>) empObj.get("pilihan");
        String benar = (String) empObj.get("benar");
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
            JSONArray empList = (JSONArray) obj;
            //String firstname = (String) jsonObject.get("firstName");
            //System.out.println("firstname : " +firstname);
            /*JSONArray coursesArray = (JSONArray) jsonObject.get("soal");
            Iterator<String> iterator = coursesArray.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
            empList.forEach(emp -> parseEmpObj((JSONObject)emp, arrayKuis));
        }
        catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        //catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}
        return arrayKuis;
    }
    
}
