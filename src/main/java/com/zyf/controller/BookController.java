package com.zyf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyf.entity.Book;
import com.zyf.service.BookService;

@Controller
public class BookController {

	
	
	@Resource
	private BookService ser;
	
	@RequestMapping("list")
	public String selectAll(Model model,@RequestParam(defaultValue="1")int pageNum,String bname){
		
		PageHelper.startPage(pageNum,3);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("bname",bname);
		List<Book> list = ser.selectAll(map);
		PageInfo<Book> page=new PageInfo<Book>(list);
		model.addAttribute("page",page);
		model.addAttribute("bname",bname);
		return "list";
	}
}
