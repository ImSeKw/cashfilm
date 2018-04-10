package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.smtindi.dto.StatementIndividual;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;

@Repository
public class StatementIndividualDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(StatementIndividualDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.statementIndividualMapper.";
	
	//개인 처음 입력 재무 등록 처리 -->
	public void insertStatementIndiFinance(List<StatementIndividual> list) {
		logger.debug("{} : insertStatementIndiFinance StatementIndividualDao",list);
		for(StatementIndividual si :list) {
			sqlSessionTemplate.insert(NAMESPACE + "insertStatementIndiFinance",si);
		}
	}
	
	//개인입력재무 등록화면
	public List<IndividualSystem> selectStatementIndiSystem(){
		logger.debug("{} : selectStatementIndiSystem StatementIndividualDao");
		return sqlSessionTemplate.selectList(NAMESPACE + "selectStatementIndiSystem");
	}
	
	
		
}
