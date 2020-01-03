package com.zyf.service;

import java.util.List;
import java.util.Map;

import com.zyf.entity.Book;

public interface BookService {
	
	List<Book> selectAll(Map<String,Object> map);//查询
}
