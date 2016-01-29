package com.lm.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.service.UserSessionServiceCluster;

@Service("testRedis")
public class testRedis {
	
	@Autowired
	UserSessionServiceCluster ussiCluster;
	
	@Autowired
	UserSessionServiceCluster ussiClusterAsync;

	public void test(){
		
		System.out.println("1111111111111111111111");
		
		ussiCluster.add();
		//ussiClusterAsync.add();
		
		System.out.println("2222222222222222222222");
		
	}

}
