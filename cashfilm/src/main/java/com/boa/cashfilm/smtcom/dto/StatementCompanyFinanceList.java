package com.boa.cashfilm.smtcom.dto;

import java.util.List;

public class StatementCompanyFinanceList {
	private List<StatementCompanyFinance> statementCompanyFinanceList;

	public List<StatementCompanyFinance> getStatementCompanyFinanceList() {
		return statementCompanyFinanceList;
	}
	public void setStatementCompanyFinanceList(List<StatementCompanyFinance> statementCompanyFinanceList) {
		this.statementCompanyFinanceList = statementCompanyFinanceList;
	}

	@Override
	public String toString() {
		return "StatementCompanyFinanceList [statementCompanyFinanceList=" + statementCompanyFinanceList + "]";
	}
}
