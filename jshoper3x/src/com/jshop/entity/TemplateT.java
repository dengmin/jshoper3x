package com.jshop.entity;

// Generated 2014-1-25 22:43:14 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TemplateT generated by hbm2java
 */
@Entity
@Table(name = "template_t", catalog = "jshoper3")
public class TemplateT implements java.io.Serializable {

	private String tid;
	private String url;
	private String note;
	private String name;
	private Date createtime;
	private String creatorid;
	private String type;
	private String themeid;
	private String themename;
	private String tvalue;
	private String sign;
	private String status;

	public TemplateT() {
	}

	public TemplateT(String tid, String url, String note, String name,
			Date createtime, String creatorid, String tvalue) {
		this.tid = tid;
		this.url = url;
		this.note = note;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.tvalue = tvalue;
	}

	public TemplateT(String tid, String url, String note, String name,
			Date createtime, String creatorid, String type, String themeid,
			String themename, String tvalue, String sign, String status) {
		this.tid = tid;
		this.url = url;
		this.note = note;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.type = type;
		this.themeid = themeid;
		this.themename = themename;
		this.tvalue = tvalue;
		this.sign = sign;
		this.status = status;
	}

	@Id
	@Column(name = "TID", unique = true, nullable = false, length = 20)
	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	@Column(name = "URL", nullable = false)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "NOTE", nullable = false, length = 100)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "TYPE", length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "THEMEID", length = 20)
	public String getThemeid() {
		return this.themeid;
	}

	public void setThemeid(String themeid) {
		this.themeid = themeid;
	}

	@Column(name = "THEMENAME", length = 45)
	public String getThemename() {
		return this.themename;
	}

	public void setThemename(String themename) {
		this.themename = themename;
	}

	@Column(name = "TVALUE", nullable = false)
	public String getTvalue() {
		return this.tvalue;
	}

	public void setTvalue(String tvalue) {
		this.tvalue = tvalue;
	}

	@Column(name = "SIGN", length = 100)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
