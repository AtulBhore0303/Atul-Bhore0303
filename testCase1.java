package jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class testCase1 {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\RCB.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject rcbjsonobj = (JSONObject)obj;
		
		JSONArray array = (JSONArray) rcbjsonobj.get("player");

		int count = 0;
		int foreigncount = 0;

		for (int i = 0; i < array.size(); i++)
		{
			JSONObject player = (JSONObject) array.get(i);

			String country = (String) player.get("country");

			if (country.equalsIgnoreCase("India"))
			{
				count++;
			} else
			{
				foreigncount++;
			}
		}
		System.out.println("Indian Players=> " + count);
		System.out.println("Foreign Players=> " + foreigncount);

		
		int expected = 4;

		if (expected == foreigncount)
		{
			System.out.println("In RCB there is : " + foreigncount + " foreign Players");
		}
	}





	}


