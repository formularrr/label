package com.label.service;
import java.util.*;
import org.springframework.dao.DataAccessException;

public interface AccountBiz<T> {
	
   public boolean addAccount(T entity) throws DataAccessException;
   
   public T getAccount(Integer id) throws DataAccessException;
   
   public List<T> getList() throws DataAccessException;
}
