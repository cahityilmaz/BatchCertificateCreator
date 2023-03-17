package com.capp.batchcertcreator;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mucahit.yilmaz
 */
public enum RDNKey {

    CN("CN", "Comman Name (CN)"),
    OU("OU", "Organizational Unit (OU)"),
    O("O", "Organization (O)"),
    L("L", "Locality (L)"),
    ST("ST", "State Name (ST)"),
    C("C", "Country (C)"),
    E("E", "Email (E)"),
    SN("SN", "Serial Number (SN)"),
    SERIALNUMBER("SERIALNUMBER", "Serial Number (SERIALNUMBER)"),
    NAME("NAME", "Name (NAME)"),
    GN("GN", "Given Name (GN)"),
    SURNAME("SURNAME", "Surname (SURNAME)");

    private final String key;
    private final String displayText;

    private RDNKey(String key, String displayText) {
        this.key = key;
        this.displayText = displayText;

    }

    public String getKey() {
        return key;
    }

    public String getDisplayText() {
        return displayText;
    }

    @Override
    public String toString() {
        return displayText;
    }

    public static ComboBoxModel<RDNKey> createComboboxModel() {
        return new DefaultComboBoxModel<>(RDNKey.values());
    }

}
