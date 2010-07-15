package com.focaplo.superinventory.http.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.focaplo.superinventory.InventoryLookUp;
import com.focaplo.superinventory.InventoryLookUpResponse;
import com.focaplo.superinventory.InventoryServiceImpl;



@Path("/items/{itemNumber}")
public class RestfulInventoryService {
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public InventoryLookUpResponse lookUpInventory(@PathParam("itemNumber") String itemNumber){
		InventoryLookUp req = new InventoryLookUp();
		req.setUid(2222);
		req.setItemNumber(itemNumber);
		InventoryServiceImpl service = new InventoryServiceImpl();
		InventoryLookUpResponse inventoryResponse = service.lookUp(req);
		//return Response.ok(inventoryResponse).build();
		return inventoryResponse;
	}
}
