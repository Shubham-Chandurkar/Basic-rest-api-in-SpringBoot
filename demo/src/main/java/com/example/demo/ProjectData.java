package com.example.demo;

public class ProjectData<Mydata> {

	String reqid;
	Mydata data;
	String appversion;

	public ProjectData(String reqid, Mydata data, String appversion) {
		super();
		this.reqid = reqid;
		this.data = data;
		this.appversion = appversion;
	}

	public String getReqid() {
		return reqid;
	}

	public void setReqid(String reqid) {
		this.reqid = reqid;
	}

	public Mydata getData() {
		return data;
	}

	public void setData(Mydata data) {
		this.data = data;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

}
