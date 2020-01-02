package com.wxh.NewServer.Generator;

import java.io.Serializable;

/**
 * mission
 * @author 
 */
public class Mission implements Serializable {
    private Integer id;

    /**
     * 任务id
     */
    private String missionId;

    /**
     * 老人身份证号
     */
    private String missionApplicantId;

    /**
     * 志愿者身份证号
     */
    private String missionVolunteerId;

    /**
     * 提供服务事件id(便于积分结算)
     */
    private String missionEventId;

    /**
     * 任务完成状态
     */
    private String missionStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public String getMissionApplicantId() {
        return missionApplicantId;
    }

    public void setMissionApplicantId(String missionApplicantId) {
        this.missionApplicantId = missionApplicantId;
    }

    public String getMissionVolunteerId() {
        return missionVolunteerId;
    }

    public void setMissionVolunteerId(String missionVolunteerId) {
        this.missionVolunteerId = missionVolunteerId;
    }

    public String getMissionEventId() {
        return missionEventId;
    }

    public void setMissionEventId(String missionEventId) {
        this.missionEventId = missionEventId;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Mission other = (Mission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMissionId() == null ? other.getMissionId() == null : this.getMissionId().equals(other.getMissionId()))
            && (this.getMissionApplicantId() == null ? other.getMissionApplicantId() == null : this.getMissionApplicantId().equals(other.getMissionApplicantId()))
            && (this.getMissionVolunteerId() == null ? other.getMissionVolunteerId() == null : this.getMissionVolunteerId().equals(other.getMissionVolunteerId()))
            && (this.getMissionEventId() == null ? other.getMissionEventId() == null : this.getMissionEventId().equals(other.getMissionEventId()))
            && (this.getMissionStatus() == null ? other.getMissionStatus() == null : this.getMissionStatus().equals(other.getMissionStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMissionId() == null) ? 0 : getMissionId().hashCode());
        result = prime * result + ((getMissionApplicantId() == null) ? 0 : getMissionApplicantId().hashCode());
        result = prime * result + ((getMissionVolunteerId() == null) ? 0 : getMissionVolunteerId().hashCode());
        result = prime * result + ((getMissionEventId() == null) ? 0 : getMissionEventId().hashCode());
        result = prime * result + ((getMissionStatus() == null) ? 0 : getMissionStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", missionId=").append(missionId);
        sb.append(", missionApplicantId=").append(missionApplicantId);
        sb.append(", missionVolunteerId=").append(missionVolunteerId);
        sb.append(", missionEventId=").append(missionEventId);
        sb.append(", missionStatus=").append(missionStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}