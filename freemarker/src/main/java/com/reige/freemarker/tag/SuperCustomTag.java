package com.reige.freemarker.tag;





import com.reige.freemarker.utils.StringUtils;

import java.util.Map;

public abstract class SuperCustomTag {
	
	/**
	 * 本方法采用多态集成的方式，然后用父类接收，用父类调用子类的 {@link result(...)} 方法。
	 * @param params
	 * @return
	 */
	protected abstract Object result(Map params);
	
	
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
}
