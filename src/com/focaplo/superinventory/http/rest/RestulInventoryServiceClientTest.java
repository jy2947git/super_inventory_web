package com.focaplo.superinventory.http.rest;

import javax.ws.rs.core.MediaType;

import org.junit.Test;


import com.focaplo.superinventory.InventoryLookUp;
import com.focaplo.superinventory.InventoryLookUpResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestulInventoryServiceClientTest {

	@Test
	public void testLookUpInventory(){
		long totalTime=0;
		for(int i=0;i<10000;i++){
			long t1=System.currentTimeMillis();
		ClientConfig cc = new DefaultClientConfig();
		Client client = Client.create(cc);
		client.setReadTimeout(3000);
		InventoryLookUpResponse res = client.resource("http://localhost:8080/SuperInventoryWeb")
		.path("/resources/items/abc2222/")
		.accept(MediaType.APPLICATION_JSON)
		.get(InventoryLookUpResponse.class);
		totalTime+=(System.currentTimeMillis()-t1);
		}
		//System.out.println(res.getQuantityOnHand());
		System.out.println("total cost:" + totalTime);
	}
}
