package com.reige.tag;

import com.reige.freemarker.tag.SuperCustomTag;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserInfoTag extends SuperCustomTag {

	/**
	 * 继承父类的方法，必须实现，返回类型为Object，方便使用，这样就可以返回Map、List、以及自己的JavaBean
	 */
	@Override
	protected Object result(Map params) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name","reige");
		map.put("sex","male");
		return map;
	}
}