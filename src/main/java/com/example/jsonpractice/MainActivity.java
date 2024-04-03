package com.example.jsonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject shows = new JSONObject();
        try {
            JSONObject characters = new JSONObject();
            characters.put("Sheldon Cooper", "String Theory");
            characters.put("Leonard Hofstadter", "Dark Matter Physicist");
            characters.put("Howard Wolowitz", "Engineer");
            characters.put("Raj Koothrapalli", "Astronomer");
            characters.put("Penny", "Actress");
            shows.put("Big Bang Theory Characters", characters);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        JSONObject TOcharacters = new JSONObject();
        try {
            TOcharacters.put("Michael Scott", "Regional Manager");
            TOcharacters.put("Dwight Shrute", "Assistant to the Regional Manager");
            TOcharacters.put("Jim Halpert", "Salesmen");
            TOcharacters.put("Pam Beesly", "Receptionist");
            TOcharacters.put("Ryan Howard", "Temp");
            shows.put("The Office Characters", TOcharacters);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        try {
            JSONObject endStatus = new JSONObject();
            endStatus.put("Michael Scott", "Moved to Colorado");
            endStatus.put("Dwight Shrute", "Regional Manager");
            endStatus.put("Jim Halpert", "Assistant to the Regional Manager");
            endStatus.put("Pam Beesly", "Saleswoman");
            endStatus.put("Ryan Howard", "M.I.A.");
            endStatus.put("The Office Characters", endStatus);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        try {
            JSONObject characters = new JSONObject();
            characters.put("Sheldon Cooper", "Main Character");
            characters.put("Missy Cooper", "Sister");
            characters.put("George Cooper", "Father");
            characters.put("George Cooper Jr.", "Brother");
            characters.put("Mary Cooper", "Mother");
            shows.put("Young Sheldon Characters", characters);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        try {
            JSONObject characters = new JSONObject();
            characters.put("Phil Dunphy", "Father");
            characters.put("Claire Dunphy", "Mother");
            characters.put("Haley Dunphy", "Oldest Sister");
            characters.put("Alex Dunphy", "Middle Sister");
            characters.put("Luke Dunphy", "Youngest Son");
            shows.put("Modern Family Characters", characters);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        try {
            JSONObject characters = new JSONObject();
            characters.put("Rachel Green", "Waitress");
            characters.put("Phoebe Buffay", "Masseuse");
            characters.put("Chandler Bing", "Computer Statistics");
            characters.put("Ross Geller", "Paleontologist");
            characters.put("Monica Geller", "Professional Chef");
            shows.put("FRIENDS Characters", characters);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        Log.d("", shows.toString());
    }
}