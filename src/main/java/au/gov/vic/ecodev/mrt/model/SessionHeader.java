package au.gov.vic.ecodev.mrt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import au.gov.vic.ecodev.mrt.model.fields.SessionStatus;

@Entity
@Table(schema="TLOADER", name="SESSION_HEADER")
public class SessionHeader implements au.gov.vic.ecodev.mrt.template.processor.model.Entity, Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -988540627996071390L;
	
	private static final String NOT_SENT = "N";
	private static final String EMPTY = "";
	
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
	
	public SessionHeader() {	
	}
	
	public SessionHeader(final long sessionId) {
		this.sessionId = sessionId;
		template = EMPTY;
		fileName = EMPTY;
		processDate = new Date();
		tenement = EMPTY;
		tenementHolder = EMPTY;
		reportingDate = new Date();
		projectName = EMPTY;
		status = SessionStatus.RUNNING.name();
		comments = EMPTY;
		emailSent = NOT_SENT;
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

	public void setStatus(SessionStatus status) {
		this.status = status.name();
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
