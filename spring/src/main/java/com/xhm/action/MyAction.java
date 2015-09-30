/** 
* @Title: MyAction.java 
* @Package com.xhm.action 
* @Description: TODO(用一句话描述该文件做什么) 
* Copyright: Copyright (c)2009 
* Company:上海建周 
* @author bingki 
* @date 2015年9月29日 下午4:16:37 
*@version 1.0 
*/
package com.xhm.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @ClassName: MyAction 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author bingki 
* @date 2015年9月29日 下午4:16:37  
*/
@Controller
public class MyAction {
	private static Logger logger = LoggerFactory.getLogger(MyAction.class);

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		logger.info("1111", "2222");
		System.out.println("111111111大幅度");
		return "1";
	}
}
