package com.in28minutes.rest.webservices.restful_web_services.helloworld;

public class helloWorldBean {

	private String message;

	public helloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}

}
