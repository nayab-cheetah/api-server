/**
 * 
 */
package com.apiserver.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apiserver.service.RewardsService;
 

/**
 * @author nayab.ali
 *
 */
@RequestMapping("/api/rewards")
@RestController()
public class RewardsController {
	 @Autowired
	RewardsService rewardService;
    RestTemplate restTemplate = null;
	RewardsController() {
		restTemplate = new RestTemplate();
     }
	/**
	 * this method is used for getting all rewards details.
	 * @return ResponseEntity<Object>
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllRewards() {
		/*
		 * String url = rewardService.getRewardsEndPoint(); HttpHeaders headers = new
		 * HttpHeaders(); headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		 * ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET,
		 * entity, Object.class); return new ResponseEntity<Object>(response.getBody(),
		 * HttpStatus.OK);
		 */
		return new ResponseEntity<Object>("helllo",HttpStatus.OK);
	}
   /**
	 * this method is used for getting rewards base on id.
	 * @return ResponseEntity<Object>
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> getRewardById(@PathVariable int id) {
		/*
		 * String url = rewardService.getRewardsEndPoint() + "/" + id; HttpHeaders
		 * headers = new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		 * ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET,
		 * entity, Object.class); return new ResponseEntity<Object>(response.getBody(),
		 * HttpStatus.OK);
		 */
		return new ResponseEntity<Object>("11111",HttpStatus.OK);
	}
	/**
	 * this method is used to create the rewards.
	 * @param id
	 * @param obj
	 * @return
	 */
	@RequestMapping(value = "/{id}/responds", method = RequestMethod.POST)  
    public ResponseEntity<Object> respond(@PathVariable("id") long id, @RequestBody Object obj) {
		String url = rewardService.getRewardsEndPoint();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.POST, entity, Object.class);
	    return new ResponseEntity<Object>(response.getBody(), HttpStatus.OK);
	}

}
