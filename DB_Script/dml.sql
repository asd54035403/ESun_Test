USE test_databases:

INSERT INTO VOTE_ITEM (ITEM_NO, ITEM_NAME) VALUES (1, '電腦'), (2, '滑鼠');
INSERT INTO VOTE_LOG (VOTER , ITEM_NO) VALUES ('Leo', 1), ('Sandy', 1), ('Sandy', 2), ('Randy', 2), ('RSY', 2);

# select * from VOTE_ITEM;
# select * from VOTE_LOG;
# show variables like 'lower_case_table_names';