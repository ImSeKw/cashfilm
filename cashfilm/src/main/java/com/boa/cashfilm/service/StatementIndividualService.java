package com.boa.cashfilm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.StatementIndividualDao;



@Service
@Transactional
public class StatementIndividualService {
	@Autowired
	private StatementIndividualDao systemindIvidualDao;
	private static final Logger logger = LoggerFactory.getLogger(StatementIndividualService.class);

}
