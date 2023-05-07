package stockMarket;

import java.io.IOException;
import java.net.URL;

public class UrlGenerator {
	
	public static URL generateStockPriceUrl(String stockSymbol) throws IOException {
		String url = "https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&symbol=" + stockSymbol + "&apikey=" + Constants.apiAccessKey;
		
		// Create a URL object from the string
        return new URL(url);
	}
}
