package com.reige.freemarker.tag;



import com.reige.freemarker.utils.FreemarkerTagUtil;
import freemarker.core.Environment;
import freemarker.template.*;

import java.io.IOException;
import java.util.Map;



public abstract class WYFTemplateModel implements TemplateDirectiveModel {

	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
                        TemplateDirectiveBody body) throws TemplateException, IOException {
		
		
		/**
		 * 模版方法模式，把变化委派下去，交给子类实现！
		 */
		Map<String, TemplateModel> paramWrap = putValue(params);
		
		
		Map<String, TemplateModel> origMap = FreemarkerTagUtil.convertToTemplateModel(env, paramWrap);
		body.render(env.getOut());
		FreemarkerTagUtil.clearTempleModel(env, paramWrap, origMap);
	}

	/**
	 * 子类实现
	 * @param params
	 * @return
	 * @throws TemplateModelException
	 */
	protected abstract Map<String, TemplateModel> putValue(Map params) throws TemplateModelException;
}
