package au.gov.vic.ecodev.mrt.model.vgp.hydro;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import au.gov.vic.ecodev.mrt.template.processor.model.Entity;

public class Observation implements Entity, Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -9168177113688805004L;

	@Id
	@Column(name="ID")
	private long id;
	@Column(name="LOADER_ID")
	private long loaderId;
	@Column(name="SITE_ID")
	private long siteId;
	@Column(name="SAMPLE_ID")
	private long sampleId;
	@Column(name="FILE_NAME")
	private String fileName;
	@Column(name="IGSN")
	private String igsn;
	@Column(name="OCCUR_TIME")
	private Timestamp occurTime;
	@Column(name="PARAM")
	private String parameter;
	@Column(name="DEPTH_FROM")
	private BigDecimal depthFrom;
	@Column(name="DEPTH_TO")
	private BigDecimal depthTo;
	@Column(name="RESULT")
	private String result;
	@Column(name="OBSERVER")
	private String observer;
	@Column(name="TYPE")
	private String type;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getLoaderId() {
		return loaderId;
	}
	public void setLoaderId(long loaderId) {
		this.loaderId = loaderId;
	}
	public long getSiteId() {
		return siteId;
	}
	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}
	public long getSampleId() {
		return sampleId;
	}
	public void setSampleId(long sampleId) {
		this.sampleId = sampleId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getIgsn() {
		return igsn;
	}
	public void setIgsn(String igsn) {
		this.igsn = igsn;
	}
	public Timestamp getOccurTime() {
		return occurTime;
	}
	public void setOccurTime(Timestamp occurTime) {
		this.occurTime = occurTime;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public BigDecimal getDepthFrom() {
		return depthFrom;
	}
	public void setDepthFrom(BigDecimal depthFrom) {
		this.depthFrom = depthFrom;
	}
	public BigDecimal getDepthTo() {
		return depthTo;
	}
	public void setDepthTo(BigDecimal depthTo) {
		this.depthTo = depthTo;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getObserver() {
		return observer;
	}
	public void setObserver(String observer) {
		this.observer = observer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
