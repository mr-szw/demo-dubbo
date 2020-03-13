package com.sindad.demo.dubbo.client.support.config;


import org.springframework.stereotype.Component;

import com.xiaomi.miliao.zookeeper.ZKFacade;

@Component
public class ZookeeperConfig {

	public static String zkAddresses;


	public void initMethod() {
		//zkAddresses = ZkServerUtils.getZkServers(ZKFacade.getZKSettings().getZKServers(ZKFacade.getZKSettings().getEnvironmentType()));
		zkAddresses = ZKFacade.getZKSettings().getZKServers(ZKFacade.getZKSettings().getEnvironmentType());
		System.out.println(zkAddresses);
	}


}
