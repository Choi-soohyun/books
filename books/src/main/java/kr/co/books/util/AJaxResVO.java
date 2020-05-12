package kr.co.books.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AJaxResVO implements Serializable{

	private static final long serialVersionUID = 1546950804264681014L;
	public static final String SUCCESS_Y = "Y";
	public static final String SUCCESS_N = "N";
	
	/** AJax처리 중 에러가 발생 했는지 판단하는 플래그 ('Y':에러 없음, 'N':에러발생)*/
	private String success = "Y";
	
	/** 처리결과가 어떻게 됬는지 판단하는 플래그로 필요에 따라 사용함 (기본값:'0')*/
	private String result = "0";
	
	/** AJax처리 후 반환할 데이터 */
	private Map<String, Object> resData = new LinkedHashMap<String, Object>();

	public Map<String, Object> addAttribute(String name, Object value) {
		if (!isNull(name, true)) {
			resData.put(name, value);
		}
		return resData;
	}
	
	public Map<String, Object> addAttributes(Map<String, Object> attr) {
		if (attr != null && !attr.isEmpty()) {
			resData.putAll(attr);
		}
		return resData;
	}
	
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Map<String, Object> getResData() {
		return resData;
	}
	
	public String toStringVO(Object vo) {		
		Object obj = vo;
		Logger logger = LoggerFactory.getLogger(AJaxResVO.class);
		String strVO = "";
		
		strVO = "success="+success+","+"result="+result;		
		
		try {
			for(Field field : obj.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				Object value = field.get(obj);
				if(value != null) {
					strVO += ","+ field.getName() +"="+ value;
				}				
			}
		} catch (Exception e) {
			logger.error("VO can't write", e);
		}		
		return strVO;
	}
	
	public String toStringResult() {
		return "success="+success+","+"result="+result;
	}
		
	/**
	 * 지정 문자열이 NULL 또는  공백문자 제거 후 빈문자열 인지 체크
	 * @param str 지정 문자열
	 * @param withTrim 좌우 공백 제거 후 체크 널 체크를 할지 지정
	 * @return 지정 문자열이 null 또는 공백일 경우 true를 반환
	 */
	public static boolean isNull(String str, boolean withTrim) {
		boolean result = (str == null) ? true : false;

		if (!result && withTrim) {
			result = (str.trim().length() == 0) ? true : false;
		}
		return result;
	}
}
