package com.ibmMeeting.VO;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class History implements Serializable{

	private int hstNo;
	private String hstRsvComp;
	private String hstRsvTitle;
	private Date hstDate;
	private Time hstTotalTime;
	private Time hstStartTime;
	private Time hstEndTime;
	private String hstRsvState;
	private String hstRsvMemNm;
	private String hstRsvMemPn;
	private String hstRsvMemEm;
	private String hstDelPwd;
	private Date hstRegDate;
	private int hstConfNo;
	private String hstRepeatPeriod;
	private String hstSetting;
	private int hstRepeatNo;
	private String hstDescription;
	
	public History(int hstNo, String hstRsvComp, String hstRsvTitle,
			Date hstDate, Time hstTotalTime, Time hstStartTime,
			Time hstEndTime, String hstRsvState, String hstRsvMemNm,
			String hstRsvMemPn, String hstRsvMemEm, String hstDelPwd,
			Date hstRegDate, int hstConfNo, String hstRepeatPeriod,
			String hstSetting, int hstRepeatNo, String hstDescription) {
		super();
		this.hstNo = hstNo;
		this.hstRsvComp = hstRsvComp;
		this.hstRsvTitle = hstRsvTitle;
		this.hstDate = hstDate;
		this.hstTotalTime = hstTotalTime;
		this.hstStartTime = hstStartTime;
		this.hstEndTime = hstEndTime;
		this.hstRsvState = hstRsvState;
		this.hstRsvMemNm = hstRsvMemNm;
		this.hstRsvMemPn = hstRsvMemPn;
		this.hstRsvMemEm = hstRsvMemEm;
		this.hstDelPwd = hstDelPwd;
		this.hstRegDate = hstRegDate;
		this.hstConfNo = hstConfNo;
		this.hstRepeatPeriod = hstRepeatPeriod;
		this.hstSetting = hstSetting;
		this.hstRepeatNo = hstRepeatNo;
		this.hstDescription = hstDescription;
	}

	public History() {
		super();
	}

	public int getHstNo() {
		return hstNo;
	}

	public void setHstNo(int hstNo) {
		this.hstNo = hstNo;
	}

	public String getHstRsvComp() {
		return hstRsvComp;
	}

	public void setHstRsvComp(String hstRsvComp) {
		this.hstRsvComp = hstRsvComp;
	}

	public String getHstRsvTitle() {
		return hstRsvTitle;
	}

	public void setHstRsvTitle(String hstRsvTitle) {
		this.hstRsvTitle = hstRsvTitle;
	}

	public Date getHstDate() {
		return hstDate;
	}

	public void setHstDate(Date hstDate) {
		this.hstDate = hstDate;
	}

	public Time getHstTotalTime() {
		return hstTotalTime;
	}

	public void setHstTotalTime(Time hstTotalTime) {
		this.hstTotalTime = hstTotalTime;
	}

	public Time getHstStartTime() {
		return hstStartTime;
	}

	public void setHstStartTime(Time hstStartTime) {
		this.hstStartTime = hstStartTime;
	}

	public Time getHstEndTime() {
		return hstEndTime;
	}

	public void setHstEndTime(Time hstEndTime) {
		this.hstEndTime = hstEndTime;
	}

	public String getHstRsvState() {
		return hstRsvState;
	}

	public void setHstRsvState(String hstRsvState) {
		this.hstRsvState = hstRsvState;
	}

	public String getHstRsvMemNm() {
		return hstRsvMemNm;
	}

	public void setHstRsvMemNm(String hstRsvMemNm) {
		this.hstRsvMemNm = hstRsvMemNm;
	}

	public String getHstRsvMemPn() {
		return hstRsvMemPn;
	}

	public void setHstRsvMemPn(String hstRsvMemPn) {
		this.hstRsvMemPn = hstRsvMemPn;
	}

	public String getHstRsvMemEm() {
		return hstRsvMemEm;
	}

	public void setHstRsvMemEm(String hstRsvMemEm) {
		this.hstRsvMemEm = hstRsvMemEm;
	}

	public String getHstDelPwd() {
		return hstDelPwd;
	}

	public void setHstDelPwd(String hstDelPwd) {
		this.hstDelPwd = hstDelPwd;
	}

	public Date getHstRegDate() {
		return hstRegDate;
	}

	public void setHstRegDate(Date hstRegDate) {
		this.hstRegDate = hstRegDate;
	}

	public int getHstConfNo() {
		return hstConfNo;
	}

	public void setHstConfNo(int hstConfNo) {
		this.hstConfNo = hstConfNo;
	}

	public String getHstRepeatPeriod() {
		return hstRepeatPeriod;
	}

	public void setHstRepeatPeriod(String hstRepeatPeriod) {
		this.hstRepeatPeriod = hstRepeatPeriod;
	}

	public String getHstSetting() {
		return hstSetting;
	}

	public void setHstSetting(String hstSetting) {
		this.hstSetting = hstSetting;
	}

	public int getHstRepeatNo() {
		return hstRepeatNo;
	}

	public void setHstRepeatNo(int hstRepeatNo) {
		this.hstRepeatNo = hstRepeatNo;
	}

	public String getHstDescription() {
		return hstDescription;
	}

	public void setHstDescription(String hstDescription) {
		this.hstDescription = hstDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hstConfNo;
		result = prime * result + ((hstDate == null) ? 0 : hstDate.hashCode());
		result = prime * result
				+ ((hstDelPwd == null) ? 0 : hstDelPwd.hashCode());
		result = prime * result
				+ ((hstDescription == null) ? 0 : hstDescription.hashCode());
		result = prime * result
				+ ((hstEndTime == null) ? 0 : hstEndTime.hashCode());
		result = prime * result + hstNo;
		result = prime * result
				+ ((hstRegDate == null) ? 0 : hstRegDate.hashCode());
		result = prime * result + hstRepeatNo;
		result = prime * result
				+ ((hstRepeatPeriod == null) ? 0 : hstRepeatPeriod.hashCode());
		result = prime * result
				+ ((hstRsvComp == null) ? 0 : hstRsvComp.hashCode());
		result = prime * result
				+ ((hstRsvMemEm == null) ? 0 : hstRsvMemEm.hashCode());
		result = prime * result
				+ ((hstRsvMemNm == null) ? 0 : hstRsvMemNm.hashCode());
		result = prime * result
				+ ((hstRsvMemPn == null) ? 0 : hstRsvMemPn.hashCode());
		result = prime * result
				+ ((hstRsvState == null) ? 0 : hstRsvState.hashCode());
		result = prime * result
				+ ((hstRsvTitle == null) ? 0 : hstRsvTitle.hashCode());
		result = prime * result
				+ ((hstSetting == null) ? 0 : hstSetting.hashCode());
		result = prime * result
				+ ((hstStartTime == null) ? 0 : hstStartTime.hashCode());
		result = prime * result
				+ ((hstTotalTime == null) ? 0 : hstTotalTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		History other = (History) obj;
		if (hstConfNo != other.hstConfNo)
			return false;
		if (hstDate == null) {
			if (other.hstDate != null)
				return false;
		} else if (!hstDate.equals(other.hstDate))
			return false;
		if (hstDelPwd == null) {
			if (other.hstDelPwd != null)
				return false;
		} else if (!hstDelPwd.equals(other.hstDelPwd))
			return false;
		if (hstDescription == null) {
			if (other.hstDescription != null)
				return false;
		} else if (!hstDescription.equals(other.hstDescription))
			return false;
		if (hstEndTime == null) {
			if (other.hstEndTime != null)
				return false;
		} else if (!hstEndTime.equals(other.hstEndTime))
			return false;
		if (hstNo != other.hstNo)
			return false;
		if (hstRegDate == null) {
			if (other.hstRegDate != null)
				return false;
		} else if (!hstRegDate.equals(other.hstRegDate))
			return false;
		if (hstRepeatNo != other.hstRepeatNo)
			return false;
		if (hstRepeatPeriod == null) {
			if (other.hstRepeatPeriod != null)
				return false;
		} else if (!hstRepeatPeriod.equals(other.hstRepeatPeriod))
			return false;
		if (hstRsvComp == null) {
			if (other.hstRsvComp != null)
				return false;
		} else if (!hstRsvComp.equals(other.hstRsvComp))
			return false;
		if (hstRsvMemEm == null) {
			if (other.hstRsvMemEm != null)
				return false;
		} else if (!hstRsvMemEm.equals(other.hstRsvMemEm))
			return false;
		if (hstRsvMemNm == null) {
			if (other.hstRsvMemNm != null)
				return false;
		} else if (!hstRsvMemNm.equals(other.hstRsvMemNm))
			return false;
		if (hstRsvMemPn == null) {
			if (other.hstRsvMemPn != null)
				return false;
		} else if (!hstRsvMemPn.equals(other.hstRsvMemPn))
			return false;
		if (hstRsvState == null) {
			if (other.hstRsvState != null)
				return false;
		} else if (!hstRsvState.equals(other.hstRsvState))
			return false;
		if (hstRsvTitle == null) {
			if (other.hstRsvTitle != null)
				return false;
		} else if (!hstRsvTitle.equals(other.hstRsvTitle))
			return false;
		if (hstSetting == null) {
			if (other.hstSetting != null)
				return false;
		} else if (!hstSetting.equals(other.hstSetting))
			return false;
		if (hstStartTime == null) {
			if (other.hstStartTime != null)
				return false;
		} else if (!hstStartTime.equals(other.hstStartTime))
			return false;
		if (hstTotalTime == null) {
			if (other.hstTotalTime != null)
				return false;
		} else if (!hstTotalTime.equals(other.hstTotalTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "History [hstNo=" + hstNo + ", hstRsvComp=" + hstRsvComp
				+ ", hstRsvTitle=" + hstRsvTitle + ", hstDate=" + hstDate
				+ ", hstTotalTime=" + hstTotalTime + ", hstStartTime="
				+ hstStartTime + ", hstEndTime=" + hstEndTime
				+ ", hstRsvState=" + hstRsvState + ", hstRsvMemNm="
				+ hstRsvMemNm + ", hstRsvMemPn=" + hstRsvMemPn
				+ ", hstRsvMemEm=" + hstRsvMemEm + ", hstDelPwd=" + hstDelPwd
				+ ", hstRegDate=" + hstRegDate + ", hstConfNo=" + hstConfNo
				+ ", hstRepeatPeriod=" + hstRepeatPeriod + ", hstSetting="
				+ hstSetting + ", hstRepeatNo=" + hstRepeatNo
				+ ", hstDescription=" + hstDescription + "]";
	}
	
}
