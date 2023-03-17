package com.capp.batchcertcreator;

/**
 *
 * @author mucahit.yilmaz
 */
public enum KeyUsage {

    DIGITAL_SIGNATURE(org.bouncycastle.asn1.x509.KeyUsage.digitalSignature),
    NON_REPUDIATION(org.bouncycastle.asn1.x509.KeyUsage.nonRepudiation),
    KEY_ENCIPHERMENT(org.bouncycastle.asn1.x509.KeyUsage.keyEncipherment),
    DATA_ENCIPHERMENT(org.bouncycastle.asn1.x509.KeyUsage.dataEncipherment),
    KEY_AGREEMENT(org.bouncycastle.asn1.x509.KeyUsage.keyAgreement),
    KEY_CERT_SIGN(org.bouncycastle.asn1.x509.KeyUsage.keyCertSign),
    CRL_SIGN(org.bouncycastle.asn1.x509.KeyUsage.cRLSign);

    private final int value;

    KeyUsage(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
