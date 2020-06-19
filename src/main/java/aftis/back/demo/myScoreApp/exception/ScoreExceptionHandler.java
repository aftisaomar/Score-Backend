package aftis.back.demo.myScoreApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import aftis.back.demo.myScoreApp.dao.ScoreRepository;

@ControllerAdvice
public class ScoreExceptionHandler {
	
	
	
	@ExceptionHandler
	public ResponseEntity<ScoreErrorResponse> genericException(Exception excep){
		
		ScoreErrorResponse scoreErrorResponse = new ScoreErrorResponse();
		
		scoreErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		scoreErrorResponse.setMessage(excep.getMessage());
		scoreErrorResponse.setTime(System.currentTimeMillis());
		
		return new ResponseEntity<ScoreErrorResponse>(scoreErrorResponse, HttpStatus.NOT_FOUND);
			
	}
	
	
	
	@ExceptionHandler
	public ResponseEntity<ScoreErrorResponse> notFoundScoreID(ScoreException scoreException){
		
		ScoreErrorResponse scoreErrorResponse = new ScoreErrorResponse();
		
		scoreErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		scoreErrorResponse.setMessage(scoreException.getMessage());
		scoreErrorResponse.setTime(System.currentTimeMillis());
		
		return new ResponseEntity<ScoreErrorResponse>(scoreErrorResponse,HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
	
	
	

}
