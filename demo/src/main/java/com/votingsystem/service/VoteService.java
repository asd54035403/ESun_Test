// VoteService.java
package com.votingsystem.service;

import com.votingsystem.model.VoteItem;
import com.votingsystem.model.VoteLog;

import java.util.List;

public interface VoteService {

	List<VoteItem> getAllVoteItems();

	VoteItem getVoteItemByItemNo(Integer itemNo);

	void addVoteItem(VoteItem voteItem);

	void updateVoteItem(Integer itemNo, VoteItem voteItem);

	void deleteVoteItem(Integer itemNo);

	void vote(Integer itemNo);

	List<VoteLog> getVoteLogs();
	
	
}
