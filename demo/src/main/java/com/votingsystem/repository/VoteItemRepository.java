package com.votingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votingsystem.model.VoteItem;

@Repository
public interface VoteItemRepository extends JpaRepository<VoteItem, Integer> {
}
