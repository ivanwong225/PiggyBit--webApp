package com.coinbase.authenticatedAPIcalls;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Accounts {

	public final static String HTTP_URL = "https://api.coinbase.com/v2/accounts";

	public static String getAccountInfo(String accessToken) throws IOException {
		HttpClient httpclient = HttpClientBuilder.create().build(); // the http-client, that will send the request
		HttpGet httpGet = new HttpGet(HTTP_URL); // the http GET request
		httpGet.addHeader("Authorization", "Bearer " + accessToken); // add the authorization header to the request
		HttpResponse response = httpclient.execute(httpGet); // the client executes the request and gets a response
		int responseCode = response.getStatusLine().getStatusCode(); // check the response code
		String stringResponse = "";
		switch (responseCode) {
		case 200: {
			// everything is fine, handle the response
			stringResponse = EntityUtils.toString(response.getEntity()); // now you have the response as String, which
																			// you can convert to a JSONObject or do
																			// other stuff
			break;
		}
		case 500: {
			// server problems ?
			System.out.println(responseCode);
			break;
		}
		case 403: {
			System.out.println(responseCode);
			break;
		}
		}
		return stringResponse;

	}

	public static String getAccounts(String input) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(input);
		JSONArray data = (JSONArray) json.get("data");
		for (Object account : data) {
			JSONObject current = (JSONObject) parser.parse(account.toString());
			Boolean check = (Boolean) current.get("primary");
			if (check) {
				return current.get("id").toString();
			}
		}
		return "no primary account";
	}

}
