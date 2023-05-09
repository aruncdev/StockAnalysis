package stockMarket;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class WebTargetProvider {
	
	public static WebTarget getWebTarget() {
		Client client = ClientBuilder.newClient();

        // Set the URL for the API call
//        String apiUrl = "https://example.com/api";
        
        String stockSymbol = "TSLA"; //MSFT, 
		String apiUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&symbol=" + stockSymbol  + "&apikey=" + Constants.apiAccessKey;

        // Create a WebTarget object from the API URL
        WebTarget target = client.target(apiUrl);
        
        return target;
	}

}
