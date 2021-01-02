package com.sankar.tech.pro.redis.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class User implements Serializable{
	
	private int id;
	private String name;
	private int age;

}
