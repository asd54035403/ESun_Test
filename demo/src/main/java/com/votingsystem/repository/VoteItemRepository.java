package com.votingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.votingsystem.model.VoteItem; 

public interface VoteItemRepository extends JpaRepository<VoteItem, Integer> {
}
