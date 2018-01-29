

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 * Created by ZhangShuzheng on 2017/4/26.
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "";
	private static String DATABASE = "zheng";
	private static String TABLE_PREFIX = "ucenter_";
	private static String PACKAGE_NAME = "com.reige.demo";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	static {
		LAST_INSERT_ID_TABLES.put("ucenter_oauth","oauth_id");
	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
	}

	/*
		<selectKey keyProperty="id" order="BEFORE" resultType="string">
			select uuid()
		</selectKey>
	*/
}
