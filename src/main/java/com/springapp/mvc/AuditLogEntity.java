package com.springapp.mvc;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by scott on 3/7/15.
 */
@Entity
@Table(name = "audit_log", schema = "", catalog = "ssd_data")
public class AuditLogEntity {
    private int id;
    private String auditId;
    private String auditName;
    private String auditType;
    private String parmeter01;
    private String parmeter02;
    private String parmeter03;
    private String parmeter04;
    private String parmeter05;
    private String parmeter06;
    private String parmeter07;
    private String parmeter08;
    private String parmeter09;
    private String parmeter10;
    private String logDetail;
    private String createUser;
    private Timestamp createDate;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Audit_ID", nullable = false, insertable = true, updatable = true, length = 24)
    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    @Basic
    @Column(name = "Audit_Name", nullable = false, insertable = true, updatable = true, length = 50)
    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    @Basic
    @Column(name = "Audit_Type", nullable = false, insertable = true, updatable = true, length = 10)
    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    @Basic
    @Column(name = "Parmeter01", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter01() {
        return parmeter01;
    }

    public void setParmeter01(String parmeter01) {
        this.parmeter01 = parmeter01;
    }

    @Basic
    @Column(name = "Parmeter02", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter02() {
        return parmeter02;
    }

    public void setParmeter02(String parmeter02) {
        this.parmeter02 = parmeter02;
    }

    @Basic
    @Column(name = "Parmeter03", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter03() {
        return parmeter03;
    }

    public void setParmeter03(String parmeter03) {
        this.parmeter03 = parmeter03;
    }

    @Basic
    @Column(name = "Parmeter04", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter04() {
        return parmeter04;
    }

    public void setParmeter04(String parmeter04) {
        this.parmeter04 = parmeter04;
    }

    @Basic
    @Column(name = "Parmeter05", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter05() {
        return parmeter05;
    }

    public void setParmeter05(String parmeter05) {
        this.parmeter05 = parmeter05;
    }

    @Basic
    @Column(name = "Parmeter06", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter06() {
        return parmeter06;
    }

    public void setParmeter06(String parmeter06) {
        this.parmeter06 = parmeter06;
    }

    @Basic
    @Column(name = "Parmeter07", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter07() {
        return parmeter07;
    }

    public void setParmeter07(String parmeter07) {
        this.parmeter07 = parmeter07;
    }

    @Basic
    @Column(name = "Parmeter08", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter08() {
        return parmeter08;
    }

    public void setParmeter08(String parmeter08) {
        this.parmeter08 = parmeter08;
    }

    @Basic
    @Column(name = "Parmeter09", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter09() {
        return parmeter09;
    }

    public void setParmeter09(String parmeter09) {
        this.parmeter09 = parmeter09;
    }

    @Basic
    @Column(name = "Parmeter10", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParmeter10() {
        return parmeter10;
    }

    public void setParmeter10(String parmeter10) {
        this.parmeter10 = parmeter10;
    }

    @Basic
    @Column(name = "Log_Detail", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getLogDetail() {
        return logDetail;
    }

    public void setLogDetail(String logDetail) {
        this.logDetail = logDetail;
    }

    @Basic
    @Column(name = "Create_User", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "Create_Date", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuditLogEntity that = (AuditLogEntity) o;

        if (id != that.id) return false;
        if (auditId != null ? !auditId.equals(that.auditId) : that.auditId != null) return false;
        if (auditName != null ? !auditName.equals(that.auditName) : that.auditName != null) return false;
        if (auditType != null ? !auditType.equals(that.auditType) : that.auditType != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (logDetail != null ? !logDetail.equals(that.logDetail) : that.logDetail != null) return false;
        if (parmeter01 != null ? !parmeter01.equals(that.parmeter01) : that.parmeter01 != null) return false;
        if (parmeter02 != null ? !parmeter02.equals(that.parmeter02) : that.parmeter02 != null) return false;
        if (parmeter03 != null ? !parmeter03.equals(that.parmeter03) : that.parmeter03 != null) return false;
        if (parmeter04 != null ? !parmeter04.equals(that.parmeter04) : that.parmeter04 != null) return false;
        if (parmeter05 != null ? !parmeter05.equals(that.parmeter05) : that.parmeter05 != null) return false;
        if (parmeter06 != null ? !parmeter06.equals(that.parmeter06) : that.parmeter06 != null) return false;
        if (parmeter07 != null ? !parmeter07.equals(that.parmeter07) : that.parmeter07 != null) return false;
        if (parmeter08 != null ? !parmeter08.equals(that.parmeter08) : that.parmeter08 != null) return false;
        if (parmeter09 != null ? !parmeter09.equals(that.parmeter09) : that.parmeter09 != null) return false;
        if (parmeter10 != null ? !parmeter10.equals(that.parmeter10) : that.parmeter10 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (auditId != null ? auditId.hashCode() : 0);
        result = 31 * result + (auditName != null ? auditName.hashCode() : 0);
        result = 31 * result + (auditType != null ? auditType.hashCode() : 0);
        result = 31 * result + (parmeter01 != null ? parmeter01.hashCode() : 0);
        result = 31 * result + (parmeter02 != null ? parmeter02.hashCode() : 0);
        result = 31 * result + (parmeter03 != null ? parmeter03.hashCode() : 0);
        result = 31 * result + (parmeter04 != null ? parmeter04.hashCode() : 0);
        result = 31 * result + (parmeter05 != null ? parmeter05.hashCode() : 0);
        result = 31 * result + (parmeter06 != null ? parmeter06.hashCode() : 0);
        result = 31 * result + (parmeter07 != null ? parmeter07.hashCode() : 0);
        result = 31 * result + (parmeter08 != null ? parmeter08.hashCode() : 0);
        result = 31 * result + (parmeter09 != null ? parmeter09.hashCode() : 0);
        result = 31 * result + (parmeter10 != null ? parmeter10.hashCode() : 0);
        result = 31 * result + (logDetail != null ? logDetail.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
