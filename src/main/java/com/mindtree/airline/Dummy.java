package com.mindtree.airline;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.ndc.orderCancel.OrderViewRS;

import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintWriter;

public class Dummy implements HttpFunction {



	public void service(HttpRequest request, HttpResponse response) throws Exception {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String filename = "OrderRetrieve-Response.json";
		JsonReader reader = new JsonReader(new FileReader(filename));

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream(filename);

		OrderViewRS resp = gson.fromJson(reader, OrderViewRS.class);
		response.setContentType("application/json");
		PrintWriter writer = new PrintWriter(response.getWriter());
		writer.write(gson.toJson(resp));
	}

}
