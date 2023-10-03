package com.votingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.votingsystem.model.VoteLog;

public interface VoteLogRepository extends JpaRepository<VoteLog, Long> {
}
