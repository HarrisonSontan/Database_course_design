package com.gec.hrmsys.domain;

/*
 *对应部门表的javabean
 * */
public class Dept {

	private Integer id; // id
	private String name; // 部门名称
	private String remark; // 详细描述

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"id=" + id +
				", name='" + name + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}

}