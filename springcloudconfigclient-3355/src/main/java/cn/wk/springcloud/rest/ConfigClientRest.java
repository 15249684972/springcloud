package cn.wk.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientRest {

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${spring.cloud.config.name}")
	private String eurekaServers;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eureka;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/config")
	public String getConfig() {
		String str = "applicationName: " + applicationName + "\t eurekaServers:" + "" + "\t port: " + port + "\t eureka"
				+ eureka;
		System.out.println("******str: " + str);
		return "applicationName: " + applicationName + "\t eurekaServers:" + "" + "\t port: " + port + "\t eureka"
				+ eureka;
	}
}
