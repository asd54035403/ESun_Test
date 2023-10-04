// VoteServiceImpl.java
package com.votingsystem.service;

import com.votingsystem.model.VoteItem;
import com.votingsystem.model.VoteLog;
import com.votingsystem.repository.VoteItemRepository;
import com.votingsystem.repository.VoteLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteItemRepository voteItemRepository;

	@Autowired
	private VoteLogRepository voteLogRepository;

	@Override
	public List<VoteItem> getAllVoteItems() {
		return voteItemRepository.findAll();
	}

	@Override
	public VoteItem getVoteItemByItemNo(Integer itemNo) {
		return voteItemRepository.findById(itemNo).orElse(null);
	}

	@Override
	public void vote(Integer itemNo) {
		// Implement the logic to record the vote in the database
		VoteLog voteLog = new VoteLog();
		voteLog.setItemNo(itemNo);

		voteLogRepository.save(voteLog);
	}

	@Override
	public List<VoteLog> getVoteLogs() {
		return voteLogRepository.findAll();
	}
}
