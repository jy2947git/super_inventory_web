package com.focaplo.superinventory;



public class InventoryServiceImpl {
	public InventoryLookUpResponse lookUp(InventoryLookUp request){
		System.out.println("received " + request);
		InventoryLookUpResponse res = new InventoryLookUpResponse();
		res.setQuantityOnHand(30);
		res.setItemNumber(request.getItemNumber());
		res.setUid(request.getUid());
		
		return res;
	}
}
