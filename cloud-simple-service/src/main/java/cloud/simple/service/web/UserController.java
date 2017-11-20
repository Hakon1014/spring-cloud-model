package cloud.simple.service.web;

import java.util.List;

import cloud.simple.service.conf.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.simple.service.domain.UserService;
import cloud.simple.service.model.User;


@RestController
//配置中心属性热加载
@RefreshScope
public class UserController {

	@Autowired
	UserService userService;
	@Value("${mysqldb.datasource.hello}")
	private String hello;

	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> readUserInfo(){

		return userService.searchAll();
	}

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String getHello(){
		return hello;
	}
}
