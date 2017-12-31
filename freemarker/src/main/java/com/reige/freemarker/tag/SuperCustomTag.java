package com.reige.freemarker.tag;





import com.reige.freemarker.utils.StringUtils;

import java.util.Map;

public abstract class SuperCustomTag<T> {


	
	
	/**
	 * 直接强转报错，需要用Object过度一下
	 * @param e
	 * @return
	 */
	protected Long getLong(Map params,String key){
		Object i = params.get(key);
		return StringUtils.isBlank(i)?null:new Long(i.toString());
	}
	protected String getString(Map params,String key){
		Object i = params.get(key);
		return StringUtils.isBlank(i)?null:i.toString();
	}

	protected Integer getInt(Map params,String key){
		Object i = params.get(key);
		return StringUtils.isBlank(i)?null:Integer.parseInt(i.toString());
	}

	protected abstract T result(Map params);
}
