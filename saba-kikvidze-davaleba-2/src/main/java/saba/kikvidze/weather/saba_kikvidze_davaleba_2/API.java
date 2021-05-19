package saba.kikvidze.weather.saba_kikvidze_davaleba_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class API {
    public String get(String path) throws Exception {
        URL url = new URL(String.format("http://localhost:8082/saba_kikvidze_davaleba_1_war_exploded/api/%s", path));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        if (connection.getResponseCode() != 200)
            throw new RuntimeException("HTTP error: " + connection.getResponseCode());

        BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));

        String output;
        StringBuilder reply = new StringBuilder();
        while ((output = br.readLine()) != null) {
            reply.append(output);
        }
        connection.disconnect();
        return reply.toString();
    }
}
