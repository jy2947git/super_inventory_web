package com.focaplo.superinventory;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InventoryLookUp {

	private int uid;
	private String itemNumber;
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
	
}
