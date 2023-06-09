package stockMarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class StockHistory {

	public static void main(String[] args) throws IOException {
		

//        String stockSymbol = "TSLA"; //MSFT, 
//		String urlString = "https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&symbol=" + stockSymbol  + "&apikey=" + Constants.apiAccessKey;
		
		// Create a URL object from the string
//		URL url = new URL(urlString);

        // Open a connection to the URL
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method and headers
//        connection.setRequestMethod("GET");
//        connection.setRequestProperty("Content-Type", "application/json");

        // Read the response from the API call
//        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String inputLine;
//        StringBuilder response = new StringBuilder();
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
		
		WebTarget target = WebTargetProvider.getWebTarget();
		String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // Print the response from the API call
        System.out.println(response.toString());
	}

}
