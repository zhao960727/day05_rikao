package com.zyf.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyf.dao.BookDao;
import com.zyf.entity.Book;
@Service
public class BookServiceImpl implements BookService{
	
	@Resource
	private BookDao dao;
	public List<Book> selectAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		List<Book> list = dao.selectAll(map);
		return list;
	}

}
