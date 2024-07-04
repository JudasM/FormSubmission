package com.example.formsubmission;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Customer
 */
@Entity
public class Customer {
    
    private String cname;
    @Id
    private Integer cid;
    private String email;
    
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Integer getCid() {
        return cid;
    }
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Customer [cname=" + cname + ", cid=" + cid + ", email=" + email + "]";
    }

    
    
}