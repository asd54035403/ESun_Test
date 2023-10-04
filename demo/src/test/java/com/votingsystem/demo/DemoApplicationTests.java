package com.votingsystem.demo;

import com.votingsystem.repository.VoteItemRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DataSource ds;

	@Autowired
	private VoteItemRepository voteItemRepository;

	@Test
	@Disabled
	@DisplayName("[test_001] check datasource")
	void test_001() {
		System.out.println("ds = " + ds);
	}

	@Test
//	@Disabled
	@DisplayName("[test_002] 測試 voteItemRepository.findAll")
	void test_002() {
		voteItemRepository.findAll().stream().forEach(System.out::println);
	}

}
