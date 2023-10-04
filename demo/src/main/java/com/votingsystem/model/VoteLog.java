// VoteLog.java
package com.votingsystem.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity(name = "VoteLog")
//@Table(name = "VOTE_LOG")
@Entity
public class VoteLog {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="VOTER")
	private String voter;
//	@Column(name = "ITEM_NO")
	private Integer itemNo;

	public String getVoter() {
		return voter;
	}

	public void setVoter(String voter) {
		this.voter = voter;
	}

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

}
