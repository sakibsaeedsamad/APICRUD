package com.sssakib.APICRUD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")
public class User {

	int id;
	String name,number,age,gender,location,image;
	
	
	public User() {
		
	}
	
	public User(int id, String name, String number, String age, String gender, String location, String image) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.image = image;
	}
	public User( String name, String number, String age, String gender, String location, String image) {
	
		this.name = name;
		this.number = number;
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.image = image;
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", number=" + number + ", age=" + age + ", gender=" + gender
				+ ", location=" + location + ", image=" + image + "]";
	}
	
	
	
}
