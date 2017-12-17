package com.reige.freemarker.extend;


import com.reige.freemarker.Constant;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

public class FreeMarkerViewExtend extends FreeMarkerView {

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request){
		
		try {
			super.exposeHelpers(model, request);
		} catch (Exception e) {
//			LoggerUtils.fmtError(FreeMarkerViewExtend.class,e, "FreeMarkerViewExtend 加载父类出现异常。请检查。");
		}
		model.put(Constant.CONTEXT_PATH, request.getContextPath());
		model.putAll(com.reige.freemarker.extend.Ferrmarker.initMap);

		
		model.put("_time", new Date().getTime());
		model.put("NOW_YEAY", Constant.NOW_YEAY);//今年
		
		model.put("_v", Constant.VERSION);//版本号，重启的时间

		model.put("basePath", request.getContextPath());//base目录。
		System.out.println("request:"+request.getContextPath());
	}
}
