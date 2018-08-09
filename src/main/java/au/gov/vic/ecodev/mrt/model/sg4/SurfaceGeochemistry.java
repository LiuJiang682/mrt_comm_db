package au.gov.vic.ecodev.mrt.model.sg4;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(schema="TLOADER", name="DH_SURFACE_GEOCHEMISTRY")
public class SurfaceGeochemistry implements au.gov.vic.ecodev.mrt.template.processor.model.Entity, Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 1211633015660789468L;

	@Id
	@Column(name="ID")
	private long id;
	@Column(name="LOADER_ID")
	private long loaderId;
	@Column(name="SAMPLE_ID")
	private String sampleId;
	@Column(name="FILE_NAME")
	private String fileName;
	@Column(name="ROW_NUMBER")
	private String rowNumber;
	@Column(name="EASTING")
	private BigDecimal easting;
	@Column(name="NORTHING")
	private BigDecimal northing;
	@Column(name="SAMPLE_TYPE")
	private String sampleType;
	@Column(name="AMG_ZONE")
	private BigDecimal amgZone;
	@Column(name="ISSUE_COLUMN_INDEX")
	private int issueColumnIndex;
	
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
	public String getSampleId() {
		return sampleId;
	}
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}
	public BigDecimal getEasting() {
		return easting;
	}
	public void setEasting(BigDecimal easting) {
		this.easting = easting;
	}
	public BigDecimal getNorthing() {
		return northing;
	}
	public void setNorthing(BigDecimal northing) {
		this.northing = northing;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public BigDecimal getAmgZone() {
		return amgZone;
	}
	public void setAmgZone(BigDecimal amgZone) {
		this.amgZone = amgZone;
	}
	public int getIssueColumnIndex() {
		return issueColumnIndex;
	}
	public void setIssueColumnIndex(int issueColumnIndex) {
		this.issueColumnIndex = issueColumnIndex;
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
