package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Student {
	@ApiModelProperty(notes = "Id of the Student",name = "id",required = true,value = "1")
	private Long id;
	@ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="test name")
	private String name;
	@ApiModelProperty(notes = "Class of the Student",name="cls",required=true,value="test class")
	private String cls;
	@ApiModelProperty(notes = "Country of the Student",name="country",required=true,value="test country")
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student(Long id, String name, String cls, String country) {
		super();
		this.name = name;
		this.cls = cls;
		this.country = country;
	}
	public Student(String name, String cls, String country) {
		super();
		this.name = name;
		this.cls = cls;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getCls() {
		return cls;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
	}

}
