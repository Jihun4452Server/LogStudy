package kr.co.shortenurlservice.domain;

public class NotFoundShortenUrlException extends RuntimeException {
	public NotFoundShortenUrlException(String msg){
		super(msg);
	}
}
