package com.sankar.tech.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.sankar.tech.pro.redis.model.User;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RedisSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSpringBootApplication.class, args);
	}
	
	
	@Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		
        //RedisStandaloneConfiguration redisStandaloneConfiguration = 
		//new RedisStandaloneConfiguration("localhost", 6379);
        //redisStandaloneConfiguration.setPassword(RedisPassword.of("password"));
        //return new JedisConnectionFactory(redisStandaloneConfiguration);
        
        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, User> redisTemplate() {
        RedisTemplate<String, User> template = new RedisTemplate<String, User>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
	
	

}
