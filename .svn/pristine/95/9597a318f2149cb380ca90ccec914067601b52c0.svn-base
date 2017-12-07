/**
 * File : ServiceGeneraorUtilss.java <br/>
 * Author : alexgaoyh <br/>
 * Version : 1.1 <br/>
 * Modify : <br/>
 * Package Name : com.zhongpin.inventory.persist.code.services <br/>
 * Project Name : zp-persist-generator <br/>
 * Description : <br/>
 * 
 */

package com.zhongpin.inventory.persist.code.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * ClassName : ServiceGeneraorUtilss <br/>
 * Function : service 层代码生成器. <br/>
 * Reason : service 层代码生成器. <br/>
 * 		按照原先DAO层的逻辑，只需要修改 targetPackageBase 部分的配置，将 service 层的代码放置到 service 包下，而不是 dao 包下即可。
 * @author : lenovo <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

public class ServiceGeneraorUtilss {

	public static void main(String[] args) {
        try {
        	Properties pps = new Properties();
			pps.load(ClassLoader.class.getResourceAsStream("/mybatis-generator.properties"));
			
			String targetProject = pps.getProperty("targetProject");
			String targetPackageBase = pps.getProperty("targetPackageBase");
			String domainObjectName = pps.getProperty("domainObjectName");
			
			Map<String, Object> inputMap = new HashMap<String, Object>();
			inputMap.put("domainObjectName", domainObjectName);
			inputMap.put("targetPackageBase", targetPackageBase);
			
			generatorServiceClass(targetProject, targetPackageBase, domainObjectName, inputMap);
			generatorServiceImplClass(targetProject, targetPackageBase, domainObjectName, inputMap);
		}catch (Exception e) {
			e.printStackTrace();  
		}
	}
	
	/**
	 * service 层代码生成器
	 * 功能：<br/>
	 *
	 * @param targetProject 项目路径
	 * @param targetPackageBase 包路径
	 * @param domainObjectName 类名称
	 * @author alexgaoyh
	 */
	public static void generatorServiceClass(String targetProject, 
			String targetPackageBase, 
			String domainObjectName,
			Map<String, Object> inputMap) throws Exception{
		String fileName = targetProject + File.separator 
				+ "/src/main/java/" + File.separator +
				targetPackageBase.replace(".", File.separator)
		 		+ File.separator + "I" + domainObjectName + "Service.java";
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile("/templete/iservice.ftl", fileName, inputMap);
	}
	
	/**
	 * service 层代码生成器
	 * 功能：<br/>
	 *
	 * @param targetProject 项目路径
	 * @param targetPackageBase 包路径
	 * @param domainObjectName 类名称
	 * @author alexgaoyh
	 */
	public static void generatorServiceImplClass(String targetProject, 
			String targetPackageBase, 
			String domainObjectName,
			Map<String, Object> inputMap) throws Exception{
		String fileName = targetProject + File.separator 
				+ "/src/main/java/" + File.separator +
				targetPackageBase.replace(".", File.separator) + File.separator
				+ "impl" + File.separator
			 	+ domainObjectName + "ServiceImpl.java";
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile("/templete/serviceImpl.ftl", fileName, inputMap);
	}
	
	/**
	 * 生成文件
	 * 
	 * @param templateName
	 *            模板文件
	 * @param fileName
	 *            生成文件
	 * @param root
	 *            参数
	 */
	@SuppressWarnings("deprecation")
	private static void buildFile(String templateName, String fileName,
			Map<String, Object> root) {
		Configuration freemarkerCfg = new Configuration();
		freemarkerCfg.setClassForTemplateLoading(
				ServiceGeneraorUtilss.class, "/");
		freemarkerCfg.setEncoding(Locale.getDefault(), "UTF-8");
		Template template;
		try {
			template = freemarkerCfg.getTemplate(templateName);
			template.setEncoding("UTF-8");
			File htmlFile = new File(fileName);
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(htmlFile), "UTF-8"));
			template.process(root, out);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
