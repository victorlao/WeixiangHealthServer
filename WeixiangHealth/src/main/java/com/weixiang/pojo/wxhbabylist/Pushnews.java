package com.weixiang.pojo.wxhbabylist;

import java.util.Date;

public class Pushnews {
    private Integer id;

    private String title;

    private String label;

    private Date createdate;

    private String picpath;

    private String createuser;

    private Short nflag;

    private Short audit;

    private Date auditdate;

    private String audituser;

    private String bkpicpath;

    private byte[] pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Short getNflag() {
        return nflag;
    }

    public void setNflag(Short nflag) {
        this.nflag = nflag;
    }

    public Short getAudit() {
        return audit;
    }

    public void setAudit(Short audit) {
        this.audit = audit;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getAudituser() {
        return audituser;
    }

    public void setAudituser(String audituser) {
        this.audituser = audituser == null ? null : audituser.trim();
    }

    public String getBkpicpath() {
        return bkpicpath;
    }

    public void setBkpicpath(String bkpicpath) {
        this.bkpicpath = bkpicpath == null ? null : bkpicpath.trim();
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}