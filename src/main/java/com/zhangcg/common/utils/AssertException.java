package com.zhangcg.common.utils;

public class AssertException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	private String message;

	public AssertException() {
		super();
	}
	public AssertException(String message) {
		
		super(message);
		this.message =message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
