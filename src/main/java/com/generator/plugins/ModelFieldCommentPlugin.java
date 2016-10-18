package com.generator.plugins;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * 
 * Function: The plugin is used to generate comment for Data Access Object. 
 *
 * @author   lixiong
 * @Date	 2016年10月18日		下午2:26:57
 *
 * @see
 */
public class ModelFieldCommentPlugin extends PluginAdapter {

    public boolean validate(List<String> warnings) {
        return true;//must be true,if not,the plugin will be not used.
    }
    
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable) {
        topLevelClass.addFileCommentLine("/**");
        topLevelClass.addFileCommentLine(" * Copyright (c) "+new GregorianCalendar().get(Calendar.YEAR)+", LiXiong All rights reserved.");
        topLevelClass.addFileCommentLine(" */");
        return true;
    }
    
    @Override
    public boolean modelFieldGenerated(Field field,TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,IntrospectedTable introspectedTable,Plugin.ModelClassType modelClassType) {
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" *" + introspectedColumn.getRemarks());
        field.addJavaDocLine(" */");
        return true;
    }
}
