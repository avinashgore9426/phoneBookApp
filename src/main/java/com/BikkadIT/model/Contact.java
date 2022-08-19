package com.BikkadIT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;
	private String contactName;
	private String contactNuber;
	private String contactEmail;
	private String activeSwitch;
	private String createdDate;
	private String updateDate;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactNuber() {
		return contactNuber;
	}
	public void setContactNuber(String contactNuber) {
		this.contactNuber = contactNuber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getActiveSwitch() {
		return activeSwitch;
	}
	public void setActiveSwitch(String activeSwitch) {
		this.activeSwitch = activeSwitch;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNuber=" + contactNuber
				+ ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}
	


	
}

