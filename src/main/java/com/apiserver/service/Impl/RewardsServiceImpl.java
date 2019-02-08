/**
 * 
 */
package com.apiserver.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import com.apiserver.constants.Constants;
import com.apiserver.service.RewardsService;

 
/**
 * @author nayab.ali
 *
 */
@Component
public class RewardsServiceImpl implements RewardsService {
	public static final Logger logger = LoggerFactory.getLogger(RewardsServiceImpl.class);
	  @Autowired      
	  Environment env;
	/*
     * this method return the rewards URL.
     * @see com.service.RewardsService#getAllRewards()
     */
	@Override
	public String getRewardsEndPoint() {
		return env.getProperty(Constants.GET_REWARDS_ENDPOINT);
		
	}

}
