package au.gov.vic.ecodev.mrt.model.sl4;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import au.gov.vic.ecodev.mrt.common.db.Constants.Numeral;


@Entity
@Table(schema="TLOADER", name="LOC_SITE")
@IdClass(SiteKey.class)
public class Site implements au.gov.vic.ecodev.mrt.template.processor.model.Entity, Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -673653681493365648L;

	@Id
	@Column(name="LOADER_ID")
	private long loaderId;
	@Id
	@Column(name="SITE_ID")
	private String siteId;
	@Column(name="GSV_SITE_ID")
	private long gsvSiteId;
	@Column(name="PARISH")
	private String parish;
	@Column(name="PROSPECT")
	private String prospect;
	@Column(name="AMG_ZONE")
	private BigDecimal amgZone;
	@Column(name="EASTING")
	private BigDecimal easting;
	@Column(name="NORTHING")
	private BigDecimal northing;
	@Column(name="LATITUDE")
	private BigDecimal latitude;
	@Column(name="LONGITUDE")
	private BigDecimal Longitude;
	@Column(name="LOCN_ACC")
	private BigDecimal locnAcc;
	@Column(name="LOCN_DATUM_CD")
	private String locnDatumCd;
	@Column(name="ELEVATION_GL")
	private BigDecimal elevationGl;
	@Column(name="ELEV_ACC")
	private BigDecimal elevAcc;
	@Column(name="ELEV_DATUM_CD")
	private String elevDatumCd;
	@Column(name="COORD_SYSTEM")
	private String coordSystem;
	@Column(name="VERTICAL_DATUM")
	private String veritcalDatum;
	@Column(name="NUM_DATA_RECORDS")
	private int numberOfDataRecord = Numeral.NEGATIVE_ONE;
	@Column(name="ISSUE_COLUMN_INDEX")
	private int issueColumnIndex = Numeral.NEGATIVE_ONE;
	@Column(name="UWI")
	private String uwi;
	@Column(name="LOCN_NAME")
	private String localName;
	@Column(name="LOCN_DESC")
	private String localDescription;
	@Column(name="STATE")
	private String state;
	@Column(name="BORE_DIAMETER")
	private BigDecimal boreDiameter;
	@Column(name="TD")
	private BigDecimal td;
	@Column(name="TVD")
	private BigDecimal tvd;
	@Column(name="DEPTH_DATUM")
	private String depthDatum;
	
	public long getLoaderId() {
		return loaderId;
	}
	public void setLoaderId(long loaderId) {
		this.loaderId = loaderId;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public long getGsvSiteId() {
		return gsvSiteId;
	}
	public void setGsvSiteId(long gsvSiteId) {
		this.gsvSiteId = gsvSiteId;
	}
	public String getParish() {
		return parish;
	}
	public void setParish(String parish) {
		this.parish = parish;
	}
	public String getProspect() {
		return prospect;
	}
	public void setProspect(String prospect) {
		this.prospect = prospect;
	}
	public BigDecimal getAmgZone() {
		return amgZone;
	}
	public void setAmgZone(BigDecimal amgZone) {
		this.amgZone = amgZone;
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
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return Longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		Longitude = longitude;
	}
	public BigDecimal getLocnAcc() {
		return locnAcc;
	}
	public void setLocnAcc(BigDecimal locnAcc) {
		this.locnAcc = locnAcc;
	}
	public String getLocnDatumCd() {
		return locnDatumCd;
	}
	public void setLocnDatumCd(String locnDatumCd) {
		this.locnDatumCd = locnDatumCd;
	}
	public BigDecimal getElevationGl() {
		return elevationGl;
	}
	public void setElevationGl(BigDecimal elevationGl) {
		this.elevationGl = elevationGl;
	}
	public BigDecimal getElevAcc() {
		return elevAcc;
	}
	public void setElevAcc(BigDecimal elevAcc) {
		this.elevAcc = elevAcc;
	}
	public String getElevDatumCd() {
		return elevDatumCd;
	}
	public void setElevDatumCd(String elevDatumCd) {
		this.elevDatumCd = elevDatumCd;
	}
	public String getCoordSystem() {
		return coordSystem;
	}
	public void setCoordSystem(String coordSystem) {
		this.coordSystem = coordSystem;
	}
	public String getVeritcalDatum() {
		return veritcalDatum;
	}
	public void setVeritcalDatum(String veritcalDatum) {
		this.veritcalDatum = veritcalDatum;
	}
	public int getNumberOfDataRecord() {
		return numberOfDataRecord;
	}
	public void setNumberOfDataRecord(int numberOfDataRecord) {
		this.numberOfDataRecord = numberOfDataRecord;
	}
	
	public int getIssueColumnIndex() {
		return issueColumnIndex;
	}
	public void setIssueColumnIndex(int issueColumnIndex) {
		this.issueColumnIndex = issueColumnIndex;
	}
	public String getUwi() {
		return uwi;
	}
	public void setUwi(String uwi) {
		this.uwi = uwi;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public String getLocalDescription() {
		return localDescription;
	}
	public void setLocalDescription(String localDescription) {
		this.localDescription = localDescription;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public BigDecimal getBoreDiameter() {
		return boreDiameter;
	}
	public void setBoreDiameter(BigDecimal boreDiameter) {
		this.boreDiameter = boreDiameter;
	}
	public BigDecimal getTd() {
		return td;
	}
	public void setTd(BigDecimal td) {
		this.td = td;
	}
	public BigDecimal getTvd() {
		return tvd;
	}
	public void setTvd(BigDecimal tvd) {
		this.tvd = tvd;
	}
	public String getDepthDatum() {
		return depthDatum;
	}
	public void setDepthDatum(String depthDatum) {
		this.depthDatum = depthDatum;
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
