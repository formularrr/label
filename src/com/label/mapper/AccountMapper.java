package com.label.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.Mapper;

import com.label.po.Account;

@Mapper("mapper") 
public interface AccountMapper extends SqlMapper {
	public List<Account> getAllAccount(); 
	public Account getAccount();   
	public Account getAccountById(String id); 
	public Account getAccountByNames(String spring);  
	@Select("select * from account where username = #{name}")  
	public Account getAccountByName(String name);  
	public void addAccount(Account account);   
	public void editAccount(Account account); 
	public void removeAccount(int id);
}
