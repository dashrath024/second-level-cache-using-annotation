package com.dashzin.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Columns;


@Entity
@Table(name="student20")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY , region="Student")
public class Student {
  
	@Id
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="sid", column=@Column(name="sid")),
		@AttributeOverride(name="name", column=@Column(name="name"))
	})
	private SID id;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private long phone;
	
	public SID getId() {
		return id;
	}
	public void setId(SID id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
