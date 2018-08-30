package au.gov.vic.ecodev.mrt.model.vgp.hydro;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import au.gov.vic.ecodev.mrt.template.processor.model.Entity;

public class SampleAnalysis implements Entity, Serializable {

	/**
	 * Generate serial version UID
	 */
	private static final long serialVersionUID = -8742668609558133384L;

	@Id
	@Column(name="ID")
	private long id;
	@Column(name="LOADER_ID")
	private long loaderId;
	@Column(name="SAMPLE_ID")
	private long sampleId;
	@Column(name="FILE_NAME")
	private String fileName;
	@Column(name="ROW_NUMBER")
	private String rowNumber;
	@Column(name="IGSN")
	private String igsn;
	@Column(name="LAB_SAMP_NO")
	private String labSampleNo;
	@Column(name="ANAL_DATE")
	private Timestamp analysisDate;
	@Column(name="PARAM")
	private String parameter;
	@Column(name="UOM")
	private String uom;
	@Column(name="RESULT")
	private String result;
	@Column(name="ANAL_METH")
	private String ananlysisMethod;
	@Column(name="LOR")
	private String lor;
	
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
	public String getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getIgsn() {
		return igsn;
	}
	public void setIgsn(String igsn) {
		this.igsn = igsn;
	}
	public String getLabSampleNo() {
		return labSampleNo;
	}
	public void setLabSampleNo(String labSampleNo) {
		this.labSampleNo = labSampleNo;
	}
	public Timestamp getAnalysisDate() {
		return analysisDate;
	}
	public void setAnalysisDate(Timestamp analysisDate) {
		this.analysisDate = analysisDate;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getAnanlysisMethod() {
		return ananlysisMethod;
	}
	public void setAnanlysisMethod(String ananlysisMethod) {
		this.ananlysisMethod = ananlysisMethod;
	}
	public String getLor() {
		return lor;
	}
	public void setLor(String lor) {
		this.lor = lor;
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
