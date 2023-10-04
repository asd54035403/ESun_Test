USE test_databases:

DROP TABLE IF EXISTS VOTE_ITEM;
DROP TABLE IF EXISTS VOTE_LOG;

CREATE TABLE VOTE_ITEM
(
    ITEM_NO   INT PRIMARY KEY,
    ITEM_NAME NVARCHAR(20) NOT NULL
);

CREATE TABLE VOTE_LOG
(
    ID      INT PRIMARY KEY AUTO_INCREMENT,
    VOTER   VARCHAR(255) NOT NULL,
    ITEM_NO INT,
    FOREIGN KEY (ITEM_NO) REFERENCES VOTE_ITEM (ITEM_NO)
);