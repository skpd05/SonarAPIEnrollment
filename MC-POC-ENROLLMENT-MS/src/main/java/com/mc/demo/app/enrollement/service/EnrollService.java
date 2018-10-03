package com.mc.demo.app.enrollement.service;

import com.mc.demo.app.enrollement.CardEnrolled;
import com.mc.demo.app.enrollement.EnrollCard;
import com.mc.demo.app.enrollement.Login;
import com.mc.demo.app.enrollement.LoginResponse;
import com.mc.demo.app.enrollement.UserProfile;
import com.mc.demo.app.enrollment.exception.ApplicationException;


public interface EnrollService {
	
	public CardEnrolled validateCard(EnrollCard enrollCard);
	
	public boolean createUserProfile(UserProfile userProfile) throws ApplicationException;
	
	public boolean isUserIdAvailable(String userid);
	
	public LoginResponse ulogin(Login login);
		
}
