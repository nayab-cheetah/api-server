package com.apiserver.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apiserver.constants.Constants;
 
@Configuration
public class AppConfig {
	@Autowired
	CustomURLFilter customURLFilter;
    /**
     * this method is used to configure userdefined filter.
     * @return
     */
	@Bean
    public FilterRegistrationBean<CustomURLFilter> filterRegistrationBean() {
        FilterRegistrationBean<CustomURLFilter> registrationBean = new FilterRegistrationBean();
       // CustomURLFilter customURLFilter = new CustomURLFilter();
        registrationBean.setFilter(customURLFilter);
        registrationBean.addUrlPatterns(Constants.FILTER_URL_PATTERN);
        registrationBean.setOrder(Constants.FILTER_PRECEDENCE);  //set precedence
        return registrationBean;
    }
}
