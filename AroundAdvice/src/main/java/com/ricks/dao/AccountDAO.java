package com.ricks.dao;

public interface AccountDAO {
	public Double getBalance(Integer accNo);

	public Integer setBalance(Integer accNo, Double amount);

}
