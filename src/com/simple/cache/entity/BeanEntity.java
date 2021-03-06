package com.simple.cache.entity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.simple.cache.util.StringUtil;

public class BeanEntity{

	private String fieldName;
	private Object fieldValue;
	private Class<?> fieldType;
	private Annotation[] fieldAnnotations;
	private Field sourceField;
	
	public Annotation getAnnotation(Class<?> clazz){
		if(StringUtil.isNullOrEmpty(fieldAnnotations)){
			return null;
		}
		for (Annotation annotation:fieldAnnotations) {
			if(clazz.isAssignableFrom(annotation.annotationType())){
				return annotation;
			}
		}
		return null;
	}
	public Field getSourceField() {
		return sourceField;
	}
	public void setSourceField(Field sourceField) {
		this.sourceField = sourceField;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Object getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	public Class<?> getFieldType() {
		return fieldType;
	}
	public void setFieldType(Class<?> fieldType) {
		this.fieldType = fieldType;
	}
	public Annotation[] getFieldAnnotations() {
		return fieldAnnotations;
	}
	public void setFieldAnnotations(Annotation[] fieldAnnotations) {
		this.fieldAnnotations = fieldAnnotations;
	}
	
	
}
