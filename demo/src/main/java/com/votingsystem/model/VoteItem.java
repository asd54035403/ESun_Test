// VoteItem.java
package com.votingsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VOTE_ITEM")
public class VoteItem {

	@Id
	@Column(name = "ITEM_NO")
	private int itemNo;
	@Column(name = "ITEM_NAME")
	private String itemName;

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
