package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeServiceImpl service;
	
	@RequestMapping(value = "/code/CodeGroupList")
	
	//함수니까 퍼블릭. 스트링 + 마지막주소활용 +모델
	public String CodeGroupList(Model model) throws Exception {
		
		List<Code> list=service.selectList();
		model.addAttribute("list", list);
		
		return "code/CodeGroupList";   //여기 jsp이름
	}
	


}

