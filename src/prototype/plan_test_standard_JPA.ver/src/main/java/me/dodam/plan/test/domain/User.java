package me.dodam.plan.test.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_USER")
public class User {

	@Id
	@Column(name="USER_SEQ")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long seq;

	@Column(name="USER_ID")
	private String id;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name="BIRTH_DAY")
	private String birthDay;
	
	@OneToOne(mappedBy="user")
	private Authority authority;
	
	@Column(name="REGISTRATION_DATE")
	private Date registrationDate;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
}
