#创建表
#创建USER表（人员表）
CREATE TABLE USER (
	userId int NOT NULL AUTO_INCREMENT COMMENT '人员编号',
	username VARCHAR(100) NOT NULL COMMENT '人员姓名',
	create_userId int NOT NULL COMMENT '创建人',
	create_time TIMESTAMP COMMENT '创建时间',
	STATUS VARCHAR(10) COMMENT '用户状态：0为正常启用，1为未启用，2禁止登陆',
	PRIMARY KEY (userId),
	KEY idx_create_time (create_time),
	KEY idx_create_user(create_userId)
);

