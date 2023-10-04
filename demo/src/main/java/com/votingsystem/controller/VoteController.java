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
		return voteService.getAllVoteItems();
	}

	@PostMapping("/items")
	public void addVoteItem(@RequestBody VoteItem voteItem) {
		voteService.addVoteItem(voteItem);
	}

	@PutMapping("/items/{itemNo}")
	public void updateVoteItem(@PathVariable Integer itemNo, @RequestBody VoteItem voteItem) {
		voteService.updateVoteItem(itemNo, voteItem);
	}

	@DeleteMapping("/items/{itemNo}")
	public void deleteVoteItem(@PathVariable Integer itemNo) {
		voteService.deleteVoteItem(itemNo);
	}

	@PostMapping("/vote")
	public void vote(@RequestParam Integer itemNo) {
		voteService.vote(itemNo);
	}
}
