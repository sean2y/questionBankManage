package com.sean.questionmanage.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图跳转控制
 */
@Controller
@RequestMapping("/redirect")
public class RedirectController {

	/**
	 * 跳转到登录界面
	 * @return
	 */
	@RequestMapping("/login")
	public String toLogin() {
		return "views/system/login";
	}
	
	/**
	 * 跳转到管理系统主界面
	 * @return
	 */
	public String toIndex() {
		return "views/system/index";
	}
}
