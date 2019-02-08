/**
 * 
 */
package com.apiserver.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.apiserver.constants.Constants;
import com.apiserver.service.EndPointUrlService;

 

/**
 * @author nayab.ali
 *
 */
@Component
public class EndPointUrlServiceImpl implements EndPointUrlService{
    @Autowired      
	Environment env;
    /*
     * this method return the UserProfile URL.
     * @see com.service.EndPointUrlService#getUserProfileEndPoint()
     */
	@Override
	public String getUserProfileEndPoint() {
		// TODO Auto-generated method stub
		return env.getProperty(Constants.USER_PROFILE_ENDPOINT);
	}

}
