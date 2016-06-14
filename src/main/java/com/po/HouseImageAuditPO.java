package com.po;

import java.io.Serializable;
import java.util.Date;

public class HouseImageAuditPO implements Serializable {
    private Long id;

    private Integer houseid;

    private Integer type;

    private String imgkey;

    private String desc;

    private Byte status;

    private Date takephototime;

    private Date createtime;

    private Date updatetime;

    private Integer sourceid;

    private Long agentid;

    private Byte auditStatus;

    private Integer employeeId;

    private Date auditTime;

    private String rejectreason;

    private Date batchtime;

    private Long guestid;

    private Integer franchiseeareaorgid;

    private Byte islivephoto;

    private Byte islivevideo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgkey() {
        return imgkey;
    }

    public void setImgkey(String imgkey) {
        this.imgkey = imgkey == null ? null : imgkey.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getTakephototime() {
        return takephototime;
    }

    public void setTakephototime(Date takephototime) {
        this.takephototime = takephototime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public Long getAgentid() {
        return agentid;
    }

    public void setAgentid(Long agentid) {
        this.agentid = agentid;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRejectreason() {
        return rejectreason;
    }

    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason == null ? null : rejectreason.trim();
    }

    public Date getBatchtime() {
        return batchtime;
    }

    public void setBatchtime(Date batchtime) {
        this.batchtime = batchtime;
    }

    public Long getGuestid() {
        return guestid;
    }

    public void setGuestid(Long guestid) {
        this.guestid = guestid;
    }

    public Integer getFranchiseeareaorgid() {
        return franchiseeareaorgid;
    }

    public void setFranchiseeareaorgid(Integer franchiseeareaorgid) {
        this.franchiseeareaorgid = franchiseeareaorgid;
    }

    public Byte getIslivephoto() {
        return islivephoto;
    }

    public void setIslivephoto(Byte islivephoto) {
        this.islivephoto = islivephoto;
    }

    public Byte getIslivevideo() {
        return islivevideo;
    }

    public void setIslivevideo(Byte islivevideo) {
        this.islivevideo = islivevideo;
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
        HouseImageAuditPO other = (HouseImageAuditPO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHouseid() == null ? other.getHouseid() == null : this.getHouseid().equals(other.getHouseid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getImgkey() == null ? other.getImgkey() == null : this.getImgkey().equals(other.getImgkey()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTakephototime() == null ? other.getTakephototime() == null : this.getTakephototime().equals(other.getTakephototime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getSourceid() == null ? other.getSourceid() == null : this.getSourceid().equals(other.getSourceid()))
            && (this.getAgentid() == null ? other.getAgentid() == null : this.getAgentid().equals(other.getAgentid()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getRejectreason() == null ? other.getRejectreason() == null : this.getRejectreason().equals(other.getRejectreason()))
            && (this.getBatchtime() == null ? other.getBatchtime() == null : this.getBatchtime().equals(other.getBatchtime()))
            && (this.getGuestid() == null ? other.getGuestid() == null : this.getGuestid().equals(other.getGuestid()))
            && (this.getFranchiseeareaorgid() == null ? other.getFranchiseeareaorgid() == null : this.getFranchiseeareaorgid().equals(other.getFranchiseeareaorgid()))
            && (this.getIslivephoto() == null ? other.getIslivephoto() == null : this.getIslivephoto().equals(other.getIslivephoto()))
            && (this.getIslivevideo() == null ? other.getIslivevideo() == null : this.getIslivevideo().equals(other.getIslivevideo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHouseid() == null) ? 0 : getHouseid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getImgkey() == null) ? 0 : getImgkey().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTakephototime() == null) ? 0 : getTakephototime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getSourceid() == null) ? 0 : getSourceid().hashCode());
        result = prime * result + ((getAgentid() == null) ? 0 : getAgentid().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getRejectreason() == null) ? 0 : getRejectreason().hashCode());
        result = prime * result + ((getBatchtime() == null) ? 0 : getBatchtime().hashCode());
        result = prime * result + ((getGuestid() == null) ? 0 : getGuestid().hashCode());
        result = prime * result + ((getFranchiseeareaorgid() == null) ? 0 : getFranchiseeareaorgid().hashCode());
        result = prime * result + ((getIslivephoto() == null) ? 0 : getIslivephoto().hashCode());
        result = prime * result + ((getIslivevideo() == null) ? 0 : getIslivevideo().hashCode());
        return result;
    }
}