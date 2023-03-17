package com.capp.batchcertcreator;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mucahit.yilmaz
 */
public enum SignatureAlgorithm {

    SHA1WITHRSA("SHA1WITHRSA", "SHA-1 with RSA"),
    SHA224WITHRSA("SHA224WITHRSA", "SHA-224 with RSA"),
    SHA256WITHRSA("SHA256WITHRSA", "SHA-256 with RSA"),
    SHA384WITHRSA("SHA384WITHRSA", "SHA-384 with RSA"),
    SHA512WITHRSA("SHA512WITHRSA", "SHA-512 with RSA"),
    
    SHA1WITHDSA("SHA1WITHDSA", "SHA-1 with DSA"),
    SHA224WITHDSA("SHA224WITHDSA", "SHA-224 with DSA"),
    SHA256WITHDSA("SHA256WITHDSA", "SHA-256 with DSA"),
    SHA384WITHDSA("SHA384WITHDSA", "SHA-384 with DSA"),
    SHA512WITHDSA("SHA512WITHDSA", "SHA-512 with DSA"),
    
    SHA1WITHECDSA("SHA1WITHECDSA", "SHA-1 with ECDSA"),
    SHA224WITHECDSA("SHA224WITHECDSA", "SHA-224 with ECDSA"),
    SHA256WITHECDSA("SHA256WITHECDSA", "SHA-256 with ECDSA"),
    SHA384WITHECDSA("SHA384WITHECDSA", "SHA-384 with ECDSA"),
    SHA512WITHECDSA("SHA512WITHECDSA", "SHA-512 with ECDSA");

    private final String value;
    private final String displayText;

    private SignatureAlgorithm(String value, String displayText) {
        this.value = value;
        this.displayText = displayText;
    }

    public String getValue() {
        return value;
    }

    public String getDisplayText() {
        return displayText;
    }

    @Override
    public String toString() {
        return displayText;
    }

    public static ComboBoxModel<SignatureAlgorithm> createComboboxModel() {
        return new DefaultComboBoxModel<>(SignatureAlgorithm.values());
    }

}
