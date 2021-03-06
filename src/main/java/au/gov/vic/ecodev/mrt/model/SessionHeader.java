package au.gov.vic.ecodev.mrt.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import au.gov.vic.ecodev.mrt.common.db.Constants.Strings;
import au.gov.vic.ecodev.mrt.model.fields.SessionStatus;

@Entity
@Table(schema="TLOADER", name="SESSION_HEADER")
public class SessionHeader implements au.gov.vic.ecodev.mrt.template.processor.model.Entity, Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -988540627996071390L;
	
	private static final String NOT_SENT = "N";
	
	@Id
	@Column(name="ID")
	private long sessionId;
	@Column(name="FILE_NAME")
	private String fileName;
	@Column(name="TEMPLATE")
	private String template;
	@Column(name="PROCESS_DATE")
	private Date processDate;
	@Column(name="TENEMENT")
	private String tenement;
	@Column(name="TENEMENT_HOLDER")
	private String tenementHolder;
	@Column(name="REPORTING_DATE")
	private Date reportingDate;
	@Column(name="PROJECT_NAME")
	private String projectName;
	@Column(name="STATUS")
	private String status;
	@Column(name="COMMENTS")
	private String comments;
	@Column(name="EMAIL_SENT")
	private String emailSent;
	@Column(name="APPROVED")
	private int approved;
	@Column(name="REJECTED")
	private int rejected;
	@Column(name="CREATED")
	private Timestamp created;
	
	public SessionHeader() {	
	}
	
	public SessionHeader(final long sessionId) {
		this.sessionId = sessionId;
		template = Strings.EMPTY;
		fileName = Strings.EMPTY;
		processDate = new Date();
		tenement = Strings.EMPTY;
		tenementHolder = Strings.EMPTY;
		reportingDate = new Date();
		projectName = Strings.EMPTY;
		status = SessionStatus.RUNNING.name();
		comments = Strings.EMPTY;
		emailSent = NOT_SENT;
		approved = 0;
		rejected = 0;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public String getTenement() {
		return tenement;
	}

	public void setTenement(String tenement) {
		this.tenement = tenement;
	}

	public String getTenementHolder() {
		return tenementHolder;
	}

	public void setTenementHolder(String tenementHolder) {
		this.tenementHolder = tenementHolder;
	}

	public Date getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(Date reportingDate) {
		this.reportingDate = reportingDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public SessionStatus getStatus() {
		return SessionStatus.valueOf(status);
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getEmailSent() {
		return emailSent;
	}

	public void setEmailSent(String emailSent) {
		this.emailSent = emailSent;
	}

	public long getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(final long sessionId) {
		this.sessionId = sessionId;
	}

	public int getApproved() {
		return approved;
	}

	public void setApproved(int approved) {
		this.approved = approved;
	}

	public int getRejected() {
		return rejected;
	}

	public void setRejected(int rejected) {
		this.rejected = rejected;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
