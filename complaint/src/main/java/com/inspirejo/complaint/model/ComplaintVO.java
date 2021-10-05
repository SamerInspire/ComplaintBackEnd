package com.inspirejo.complaint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaint")
public class ComplaintVO {

	@Id
	@Column(name="complaint_Id")
	private Long complaintId;

	private String subject;
	private String complaintType;
	private String description;
	private String severity;
	private String status;
	private String preferedLanguage;
	private String userId;
	private String openedBy;
	private String updatedByUserId;

	public Long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPreferedLanguage() {
		return preferedLanguage;
	}

	public void setPreferedLanguage(String preferedLanguage) {
		this.preferedLanguage = preferedLanguage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(String openedBy) {
		this.openedBy = openedBy;
	}

	public String getUpdatedByUserId() {
		return updatedByUserId;
	}

	public void setUpdatedByUserId(String updatedByUserId) {
		this.updatedByUserId = updatedByUserId;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", subject=" + subject + ", complaintType=" + complaintType
				+ ", description=" + description + ", severity=" + severity + ", status=" + status
				+ ", preferedLanguage=" + preferedLanguage + ", userId=" + userId + ", openedBy=" + openedBy
				+ ", updatedByUserId=" + updatedByUserId + "]";
	}
}
