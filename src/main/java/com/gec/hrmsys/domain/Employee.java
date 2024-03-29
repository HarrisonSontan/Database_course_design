package com.gec.hrmsys.domain;

import java.util.Date;

//每一个员工只有 唯一的 部门及 职位
public class Employee {
	private Integer id; // id
	private Dept dept; // 部门
	private Job job; // 职位
	private String name; // 名称
	private String cardId; // 身份证
	private String address; // 地址
	private String postCode; // 邮政编码
	private String tel; // 电话
	private String phone; // 手机
	private String qqNum; // qq
	private String email; // 邮箱
	private Integer sex; // 性别
	private String party; // 政治面貌
	private java.util.Date birthday; // 生日
	private String race; // 名族
	private String education; // 学历
	private String speciality; // 专业
	private String hobby; // 爱好
	private String remark; // 备注
	private java.util.Date createDate; // 建档日期
    //getter setter 构造 toStr 略


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", dept=" + dept +
				", job=" + job +
				", name='" + name + '\'' +
				", cardId='" + cardId + '\'' +
				", address='" + address + '\'' +
				", postCode='" + postCode + '\'' +
				", tel='" + tel + '\'' +
				", phone='" + phone + '\'' +
				", qqNum='" + qqNum + '\'' +
				", email='" + email + '\'' +
				", sex=" + sex +
				", party='" + party + '\'' +
				", birthday=" + birthday +
				", race='" + race + '\'' +
				", education='" + education + '\'' +
				", speciality='" + speciality + '\'' +
				", hobby='" + hobby + '\'' +
				", remark='" + remark + '\'' +
				", createDate=" + createDate +
				'}';
	}
}