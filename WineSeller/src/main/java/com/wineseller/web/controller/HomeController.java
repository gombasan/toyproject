package com.wineseller.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wineseller.web.Service.WineService;
import com.wineseller.web.entity.WineEntity;

@Controller
public class HomeController {
	
	@Autowired
	private WineService wineService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/serch")
	public String serch(Model model) {
		
		
		List<WineEntity> list = wineService.getList();
		
		model.addAttribute("list", list);
		return "SerchList";
	}
	
	@RequestMapping("/detail")
	@ResponseBody
	public WineEntity detail(@RequestParam(name = "id", defaultValue = "1")int WineId) {
		WineEntity detail = wineService.getView(WineId);
		return detail;
	}
}
