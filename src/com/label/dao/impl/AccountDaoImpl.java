package com.label.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.label.dao.AccountDao;
import com.label.mapper.AccountMapper;
import com.label.po.Account;

@SuppressWarnings("unchecked")
@Repository("accountDaoImpl")
public class AccountDaoImpl<T extends Account> implements AccountDao<T> {

	@Autowired(required=false)
	@Qualifier("mapper")
	private AccountMapper mapper;
	public boolean addAccount(T entity) throws DataAccessException {
		 boolean flag=false;
		 try{
			 mapper.addAccount(entity);
			 flag=true;
		 }
		 catch(DataAccessException e)
		 {
			 flag=false;
			 throw e;
		 }
		 return flag;
	}
	public T getAccount(Integer id) throws DataAccessException { 
		T entity = null; 
	   try
	   { 
		   entity = (T)mapper.getAccountById(String.valueOf(id));  
	   }
	   catch(DataAccessException e) 
	   { throw e;  	}  
	   return entity;
	}
	public List<T> getList() throws DataAccessException {
		return (List<T> )mapper.getAllAccount();
	}

}
