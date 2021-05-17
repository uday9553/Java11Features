package com.uday;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class HTTPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri="https://getsomeresource";
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()
				.build();
		
		HttpClient client=HttpClient
				.newBuilder()
				.connectTimeout(Duration.ofMinutes(1))
				.build();
		//from java11 httpcient java.incubator has been removed
		//now it has to be imported from java.net.http
		try {
			HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
			response.statusCode();
			response.body();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
