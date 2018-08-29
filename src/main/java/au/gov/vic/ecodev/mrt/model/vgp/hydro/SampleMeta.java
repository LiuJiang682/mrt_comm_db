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

public class SampleMeta implements Entity, Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 890285454892578832L;
	
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
	@Column(name="CORE_ID")
	private long coreId;
	@Column(name="LAB_CODE")
	private String labCode;
	@Column(name="TYPE")
	private String type;
	@Column(name="PREP_CODE")
	private String prepCode;
	@Column(name="SAMP_DATE")
	private Timestamp sampleDate;
	@Column(name="IGSN")
	private String igsn;
	@Column(name="SAMP_TOP")
	private BigDecimal sampleTop;
	@Column(name="SAMP_BOTTOM")
	private BigDecimal sampleBottom;
	@Column(name="STAND_WATER_LVL")
	private BigDecimal standardWaterLevel;
	@Column(name="PUMPING_DEPTH")
	private BigDecimal pumpingDepth;
	@Column(name="REFERENCE")
	private String reference;
	@Column(name="SAMP_AREA_DESC")
	private String sampleAreaDesc;
	
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

	public long getCoreId() {
		return coreId;
	}

	public void setCoreId(long coreId) {
		this.coreId = coreId;
	}

	public String getLabCode() {
		return labCode;
	}

	public void setLabCode(String labCode) {
		this.labCode = labCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrepCode() {
		return prepCode;
	}

	public void setPrepCode(String prepCode) {
		this.prepCode = prepCode;
	}

	public Timestamp getSampleDate() {
		return sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
	}

	public String getIgsn() {
		return igsn;
	}

	public void setIgsn(String igsn) {
		this.igsn = igsn;
	}

	public BigDecimal getSampleTop() {
		return sampleTop;
	}

	public void setSampleTop(BigDecimal sampleTop) {
		this.sampleTop = sampleTop;
	}

	public BigDecimal getSampleBottom() {
		return sampleBottom;
	}

	public void setSampleBottom(BigDecimal sampleBottom) {
		this.sampleBottom = sampleBottom;
	}

	public BigDecimal getStandardWaterLevel() {
		return standardWaterLevel;
	}

	public void setStandardWaterLevel(BigDecimal standardWaterLevel) {
		this.standardWaterLevel = standardWaterLevel;
	}

	public BigDecimal getPumpingDepth() {
		return pumpingDepth;
	}

	public void setPumpingDepth(BigDecimal pumpingDepth) {
		this.pumpingDepth = pumpingDepth;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSampleAreaDesc() {
		return sampleAreaDesc;
	}

	public void setSampleAreaDesc(String sampleAreaDesc) {
		this.sampleAreaDesc = sampleAreaDesc;
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
