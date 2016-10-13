package com.gth.foodshare.model;

public class Mall implements Cloneable {
	private Integer id;

	private Double price;

	private String title;

	private String subtitle;

	private String pptlist;

	private String piclist;

	private String announcement;

	private String ilemlist;

	private String address;

	@Override
	public Mall clone() {
		try {
			return (Mall) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle == null ? null : subtitle.trim();
	}

	public String getPptlist() {
		return pptlist;
	}

	public void setPptlist(String pptlist) {
		this.pptlist = pptlist == null ? null : pptlist.trim();
	}

	public String getPiclist() {
		return piclist;
	}

	public void setPiclist(String piclist) {
		this.piclist = piclist == null ? null : piclist.trim();
	}

	public String getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(String announcement) {
		this.announcement = announcement == null ? null : announcement.trim();
	}

	public String getIlemlist() {
		return ilemlist;
	}

	public void setIlemlist(String ilemlist) {
		this.ilemlist = ilemlist == null ? null : ilemlist.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
}