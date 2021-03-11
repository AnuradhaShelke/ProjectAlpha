package com.hibernate;
// Generated Feb 3, 2021 9:33:25 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "hibermap")
public class Student implements java.io.Serializable {

	private Integer sid;
	private Country country;
	private String sgrade;
	private String sname;

	public Student() {
	}

	public Student(Country country, String sgrade, String sname) {
		this.country = country;
		this.sgrade = sgrade;
		this.sname = sname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sid", unique = true, nullable = false)
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cid", nullable = false)
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Column(name = "sgrade", nullable = false, length = 45)
	public String getSgrade() {
		return this.sgrade;
	}

	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}

	@Column(name = "sname", nullable = false, length = 45)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
