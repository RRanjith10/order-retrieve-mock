/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mindtree.airline;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;
import com.ndc.orderCancel.OrderReshopRQ;
import com.ndc.orderCancel.OrderReshopRS;

public class OrderReshopFunction implements HttpFunction {
	private static final Logger logger = Logger.getLogger(OrderReshopFunction.class.getName());

	private static final Gson gson = new Gson();

	//SoapClient soapClient = new SoapClient();

	@Override
	public void service(HttpRequest request, HttpResponse response) throws IOException {
		OrderReshopRQ orderReshopRq = null;
		OrderReshopRS orderReshopRes = null;
//VJ43J9
		try {
			orderReshopRq = gson.fromJson(request.getReader(), OrderReshopRQ.class);
			//orderReshopRes = soapClient.getReshopDetails(orderReshopRq);

		} catch (Exception e) {
			logger.severe("Error parsing JSON: " + e.getMessage());
		}
        response.setContentType("application/json");
		PrintWriter writer = new PrintWriter(response.getWriter());
		writer.write(gson.toJson(orderReshopRes));

	}
}
