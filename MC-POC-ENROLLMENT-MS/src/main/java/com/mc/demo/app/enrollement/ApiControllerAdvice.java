////////////////////////////////////////////////////////////////////////////////////////////
// @ID: ApiControllerAdvice.java
// @Author: Rituraj Kumar
// Date: 9/20/2018.
//
// Purpose:
//
// CONFIDENTIAL -- Copyright 2018 Wipro.
// This is confidential and proprietary information of Wipro.
// Use of copyright notice is precautionary and does not imply publication or disclosure.
////////////////////////////////////////////////////////////////////////////////////////////
package com.mc.demo.app.enrollement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.mc.demo.app.enrollment.exception.ApplicationException;
import com.mc.demo.app.enrollment.exception.BadRequestException;
import com.mc.demo.app.enrollment.exception.ErrorInfo;
import com.mc.demo.app.enrollment.exception.ErrorResponse;
import com.mc.demo.app.enrollment.exception.ObjectNotFoundException;

@ControllerAdvice
@RestController
public class ApiControllerAdvice {

	public static final String FATAL = "Fatal";
	public static final String SERVICE_UNAVAILABLE = "serverUnavailable";
	private static final String INVALID = "invalid";
	private static final String ERROR = "error";
	private static final String INVALIDREQUEST = "invalidRequest";
	private static final String RESRCNOTFOUND = "resourceNotFound";
	private static final String PARAM_NOT_VALID = "Missing or invalid Parameters";

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponse> generalException(Exception e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> errors = new ArrayList<>();
		ErrorInfo error1 = new ErrorInfo();
		error1.setType(FATAL);
		error1.setCode(SERVICE_UNAVAILABLE);
		error1.setDetails("The request failed due to an internal error");
		error1.setLocation("");
		error1.setMoreinfo(e.getMessage());
		errors.add(error1);
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = ApplicationException.class)
	public ResponseEntity<ErrorResponse> specialException(ApplicationException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> specialErrors = new ArrayList<>();
		ErrorInfo specialError = new ErrorInfo();
		specialError.setType(FATAL);
		specialError.setCode(SERVICE_UNAVAILABLE);
		specialError.setDetails("The request failed due to an internal error");
		specialError.setLocation("");
		specialError.setMoreinfo(e.getMessage());
		specialErrors.add(specialError);
		errorResponse.setErrors(specialErrors);
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = BadRequestException.class)
	public ResponseEntity<ErrorResponse> badRequestException(BadRequestException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> badErrors = new ArrayList<>();
		ErrorInfo badError = new ErrorInfo();
		badError.setType(INVALID);
		badError.setCode(INVALIDREQUEST);
		badError.setDetails(PARAM_NOT_VALID);
		badError.setLocation("");
		badError.setMoreinfo(e.getMessage());
		badErrors.add(badError);
		errorResponse.setErrors(badErrors);
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = ObjectNotFoundException.class)
	public ResponseEntity<ErrorResponse> objectNotFoundException(ObjectNotFoundException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> ObjErrors = new ArrayList<>();
		ErrorInfo ObjError = new ErrorInfo();
		ObjError.setType(ERROR);
		ObjError.setCode(RESRCNOTFOUND);
		ObjError.setDetails("Empty resource/resource not found");
		ObjError.setLocation("");
		ObjError.setMoreinfo(e.getMessage());
		ObjErrors.add(ObjError);
		errorResponse.setErrors(ObjErrors);
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> methodArgumentNotValidException(MethodArgumentNotValidException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> Methoderrors = new ArrayList<>();
		ErrorInfo error2 = new ErrorInfo();
		error2.setType(INVALID);
		error2.setCode(INVALIDREQUEST);
		error2.setDetails(PARAM_NOT_VALID);
		error2.setLocation("");
		error2.setMoreinfo(e.getMessage());
		Methoderrors.add(error2);
		errorResponse.setErrors(Methoderrors);
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = ServletRequestBindingException.class)
	public ResponseEntity<ErrorResponse> servletRequestBindingException(ServletRequestBindingException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> Serverrors = new ArrayList<>();
		ErrorInfo error3 = new ErrorInfo();
		error3.setType(INVALID);
		error3.setCode(INVALIDREQUEST);
		error3.setDetails(PARAM_NOT_VALID);
		error3.setLocation("");
		error3.setMoreinfo(e.getMessage());
		Serverrors.add(error3);
		errorResponse.setErrors(Serverrors);
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
	public ResponseEntity<ErrorResponse> httpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> errors = new ArrayList<>();
		ErrorInfo error4 = new ErrorInfo();
		error4.setType(INVALID);
		error4.setCode(INVALIDREQUEST);
		error4.setDetails(PARAM_NOT_VALID);
		error4.setLocation("");
		error4.setMoreinfo(e.getMessage());
		errors.add(error4);
		errorResponse.setErrors(errors);
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponseEntity<ErrorResponse> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse();
		List<ErrorInfo> errors = new ArrayList<>();
		ErrorInfo error5 = new ErrorInfo();
		error5.setType(ERROR);
		error5.setCode(RESRCNOTFOUND);
		error5.setDetails("Empty resource/resource not found");
		error5.setLocation("");
		error5.setMoreinfo(ex.getMessage());

		errors.add(error5);
		errorResponse.setErrors(errors);
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}

}
