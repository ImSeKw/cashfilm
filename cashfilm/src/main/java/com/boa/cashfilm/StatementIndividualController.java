package com.boa.cashfilm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boa.cashfilm.service.StatementIndividualService;

@Controller
public class StatementIndividualController {
	@Autowired
	private StatementIndividualService statementIndividualService;
	private static final Logger logger=LoggerFactory.getLogger(StatementIndividualController.class);

}
