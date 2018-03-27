package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.sysindi.dto.IndividualSystem;

@Repository
public class SystemIndividualDao {
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	private static final Logger logger = LoggerFactory.getLogger(SystemIndividualDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.systemIndividualMapper.";
	
	//계정체계관리 삭제 
	public int deleteIndividualSystem(IndividualSystem isystem) {
		logger.debug("isystem deleteIndividualSystem");
		return sqlsessiontemplate.delete(NAMESPACE + "deleteIndividualSystem",isystem);
	}
		
	
	//계정체계관리 수정 
	public int updateIndividualSystem(IndividualSystem isystem) {
		logger.debug("isystem updateIndividualSystem");
		return sqlsessiontemplate.update(NAMESPACE + "updateIndividualSystem",isystem);
	}
	
	//계정체계관리수정을 위한 검색
	public IndividualSystem selectOneIndividualSystem(int individualSystemNumeral) {
		logger.debug("{} : selectOneIndividualSystem",individualSystemNumeral);
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneIndividualSystem",individualSystemNumeral);
	}
	
	//계정체계관리 검색  /
	public List<IndividualSystem>selectIndividualSystem() {
		logger.debug("isystem selectIndividualSystem");
		return sqlsessiontemplate.selectList(NAMESPACE +"selectIndividualSystem");
	}	
	
	//계정체계관리 등록 
	public int insertIndividualSystem(IndividualSystem isystem) {
		logger.debug("{} : isystem insertIndividualSystem",isystem);
		return sqlsessiontemplate.insert(NAMESPACE + "insertIndividualSystem", isystem);
	}
}

