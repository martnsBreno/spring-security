package com.martnsBreno.springsecuritybasics.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class NoticeDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "notice_id")
    private int noticeId;

    @Column(name = "notice_summary")
    private String noticeSummary;

    @Column(name = "notice_details")
    private String noticeDetail;

    @Column(name = "notic_beg_dt")
    private Date noticBegDate;

    @Column(name = "notic_end_dt")
    private Date noticEndDate;

    @Column(name = "create_dt")
    private Date createDate;

    @Column(name = "update_dt")
    private Date updateDate;

    

    public String getNoticeSummary() {
        return noticeSummary;
    }

    public void setNoticeSummary(String noticeSummary) {
        this.noticeSummary = noticeSummary;
    }

    public String getNoticeDetail() {
        return noticeDetail;
    }

    public void setNoticeDetail(String noticeDetails) {
        this.noticeDetail = noticeDetails;
    }

    public Date getNoticBegDate() {
        return noticBegDate;
    }

    public void setNoticBegDate(Date noticBegDate) {
        this.noticBegDate = noticBegDate;
    }

    public Date getNoticEndDate() {
        return noticEndDate;
    }

    public void setNoticEndDate(Date noticEndDate) {
        this.noticEndDate = noticEndDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    
}
