package com.boa.cashfilm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatementIndividualDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(StatementIndividualDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.statementIndividualMapper.";
}
