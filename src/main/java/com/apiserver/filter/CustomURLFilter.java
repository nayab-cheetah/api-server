package com.apiserver.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class CustomURLFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomURLFilter.class);
    Map<String, String> map = new HashMap<String, String>();
    String defaultURI="/api/rewards" ;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("########## Initiating CustomURLFilter filter ##########");
        map.put("/api/rewards", "/api/rewards");
        map.put("/api/rewards/login", "/api/rewards/login");
        map.put("/api/rewards/1", "/api/rewards/1");
       
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest request = (HttpServletRequest) req;
        String requestURI = request.getRequestURI();
       

        if (!map.containsKey(requestURI.trim())) {
             req.getRequestDispatcher(defaultURI).forward(req, res);
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}