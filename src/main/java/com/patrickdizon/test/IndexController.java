package com.patrickdizon.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.patrickdizon.test.dao.ZipCodeDao;
import com.patrickdizon.test.entity.*;
@Controller
public class IndexController {
	
	@Autowired
	ZipCodeDao zdao;
	
	@RequestMapping("/")
	public String home() {
		
		return "index.jsp";
	}
	
	@RequestMapping("/feedback")
	@ResponseBody
	public List<ZipCode> feedback() {
		List<ZipCode> zips = zdao.getZipCodes();
		return zips;
	}
}
