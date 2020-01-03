package com.zyf.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zyf.entity.Book;

public interface BookDao {
	List<Book> selectAll(Map<String,Object> map);//查询
	
	
	void  addBook(Book book);


	void addError(@Param("bid")int parseInt,@Param("errorinfo")int i);
	
}
