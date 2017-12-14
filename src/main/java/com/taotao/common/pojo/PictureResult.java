package com.taotao.common.pojo;

/**
 * 上传图片的返回结果
 * <p>Title: PictureResult</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年8月15日下午2:53:21
 * @version 1.0
 */
public class PictureResult {

	private int error;
	private String url;
	private String message;
	
	private PictureResult(int error, String url, String message) {
		this.error = error;
		this.url = url;
		this.message = message;
	}
	//成功时调用的方法
	public static PictureResult ok(String url) {
		return new PictureResult(0, url, null);
	}
	//失败时调用的方法
	public static PictureResult error(String message) {
		return new PictureResult(1, null, message);
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
