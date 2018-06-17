package au.gov.vic.ecodev.mrt.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@Entity
@Table(schema="TLOADER", name="FILE_ERROR_LOG")
public class FileLog implements au.gov.vic.ecodev.mrt.template.processor.model.Entity, Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -1567485571085105591L;
	
	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "BATCH_ID")
	private long batchId;
	
	@Column(name = "SEVERITY")
	private String severity;
	
	@Column(name = "ERROR_MSG")
	private String message;
	
	@Column(name = "CREATED_TIME")
	private Timestamp createdTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBatchId() {
		return batchId;
	}

	public void setBatchId(long batchId) {
		this.batchId = batchId;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
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
