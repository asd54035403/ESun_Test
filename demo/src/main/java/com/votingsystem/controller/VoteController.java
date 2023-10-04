// VoteController.java
package com.votingsystem.controller;

import com.votingsystem.model.VoteItem;
import com.votingsystem.model.VoteLog;
import com.votingsystem.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vote")
public class VoteController {

	@Autowired
	private VoteService voteService;

	@GetMapping("/items")
	public List<VoteItem> getAllVoteItems() {
		System.out.println(voteService.getAllVoteItems());
		return voteService.getAllVoteItems();
	}

	@GetMapping("/items/{itemNo}")
	public VoteItem getVoteItemByItemNo(@PathVariable Integer itemNo) {
		return voteService.getVoteItemByItemNo(itemNo);
	}

	@PostMapping("/vote/{itemNo}")
	public void vote(@PathVariable Integer itemNo) {
		voteService.vote(itemNo);
	}

	@GetMapping("/logs")
	public List<VoteLog> getVoteLogs() {
		return voteService.getVoteLogs();
	}
}
