package com.novatec.test.api.models;

import org.springframework.http.HttpStatus;

/**
 * 
 * @author Albeiro Silva
 *
 * @param <T>
 */
public class Response<T> {

	private HttpStatus status;

	private String userMessage;

	private String developerMessage;

	private String errorCode;

	private String moreInfo;

	private T data;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMoreInfo() {
		return moreInfo;
	}

	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [state=" + status + ", userMessage=" + userMessage + ", developerMessage=" + developerMessage
				+ ", moreInfo=" + moreInfo + ", data=" + data + "]";
	}
}
