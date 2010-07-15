package com.focaplo.superinventory;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InventoryLookUpResponse {
	private int uid;
	private String itemNumber;
	private int quantityOnHand;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	
}
