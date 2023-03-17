package com.capp.batchcertcreator;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.x500.X500Name;

/**
 *
 * @author mucahit.yilmaz
 */
public class CertInfo {

    private boolean isCA;
    private int keySize;
    private String signatureAlgorithm;
    private Date validFrom;
    private Date validUntil;
    private X500Name subject;
    private X500Name issuer;
    private BigInteger serialNumber;

    private String cn;
    private String identityNo; //serialNumber
    private String organization;
    private String organizationalUnit;
    private String country;
    private String domain;

    public boolean isIsCA() {
        return isCA;
    }

    public CertInfo setIsCA(boolean isCA) {
        this.isCA = isCA;
        return this;
    }

    public int getKeySize() {
        return keySize;
    }

    public CertInfo setKeySize(int keySize) {
        this.keySize = keySize;
        return this;
    }

    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public CertInfo setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public CertInfo setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public CertInfo setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public X500Name getSubject() {
        return subject;
    }

    private CertInfo setSubject(X500Name subject) {
        this.subject = subject;
        return this;
    }

    public X500Name getIssuer() {
        return issuer;
    }

    public CertInfo setIssuer(X500Name issuer) {
        this.issuer = issuer;
        return this;
    }

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public CertInfo setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
        setSubject(new X500Name(createSubjectString()));
        return this;
    }

    public String getCn() {
        return cn;
    }

    public CertInfo setCn(String cn) {
        this.cn = cn;
        setSubject(new X500Name(createSubjectString()));
        return this;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public CertInfo setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
        return this;
    }

    public String getOrganization() {
        return organization;
    }

    public CertInfo setOrganization(String organization) {
        this.organization = organization;
        setSubject(new X500Name(createSubjectString()));
        return this;
    }

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public CertInfo setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        setSubject(new X500Name(createSubjectString()));
        return this;
    }

    public String getCountry() {
        return country;
    }

    public CertInfo setCountry(String country) {
        this.country = country;
        setSubject(new X500Name(createSubjectString()));
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public CertInfo setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    private String createSubjectString() {
        var subjectAsString = "";
        if (country != null && !country.isBlank()) {
            subjectAsString += RDNKey.C.getKey() + "=" + country;
        }
        if (organization != null && !organization.isBlank()) {
            subjectAsString += "," + RDNKey.O.getKey() + "=" + organization;
        }
        if (organizationalUnit != null && !organizationalUnit.isBlank()) {
            subjectAsString += "," + RDNKey.OU.getKey() + "=" + organizationalUnit;
        }
        if (identityNo != null && !identityNo.isBlank()) {
            subjectAsString += "," + RDNKey.SERIALNUMBER.getKey() + "=" + identityNo;
        }
        if (subjectAsString.isBlank()) {
            subjectAsString = RDNKey.CN.getKey() + "=" + cn;
        } else {
            subjectAsString += "," + RDNKey.CN.getKey() + "=" + cn;
        }
        return subjectAsString;
    }

}
