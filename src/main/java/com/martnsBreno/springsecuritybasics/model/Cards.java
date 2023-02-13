package com.martnsBreno.springsecuritybasics.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cards {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "card_id")
    private int cardId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "card_number")
    private Integer accountNumber;

    @Column(name = "card_type")
    private String accountType;

    @Column(name = "total_limit")
    private Integer total_limit;

    @Column(name = "amount_used")
    private Integer amountUser;

    @Column(name = "create_dt")
    private Date createDate;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getTotal_limit() {
        return total_limit;
    }

    public void setTotal_limit(Integer total_limit) {
        this.total_limit = total_limit;
    }

    public Integer getAmountUser() {
        return amountUser;
    }

    public void setAmountUser(Integer amountUser) {
        this.amountUser = amountUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    

}
