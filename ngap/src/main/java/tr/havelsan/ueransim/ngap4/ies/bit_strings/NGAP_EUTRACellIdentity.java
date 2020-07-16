package tr.havelsan.ueransim.ngap4.ies.bit_strings;

import tr.havelsan.ueransim.ngap4.core.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap4.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap4.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap4.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap4.ies.sequences.*;
import tr.havelsan.ueransim.ngap4.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap4.ies.choices.*;
import tr.havelsan.ueransim.ngap4.ies.integers.*;
import tr.havelsan.ueransim.ngap4.ies.enumerations.*;

import java.util.List;

public class NGAP_EUTRACellIdentity extends NgapBitString {

    public NGAP_EUTRACellIdentity(BitString value) {
        super(value);
    }

    public NGAP_EUTRACellIdentity(OctetString octetString, int bitLength) {
        super(octetString, bitLength);
    }

    public NGAP_EUTRACellIdentity(OctetString octetString) {
        super(octetString);
    }

    public NGAP_EUTRACellIdentity(Octet[] octets, int bitLength) {
        super(octets, bitLength);
    }

    public NGAP_EUTRACellIdentity(Octet[] octets) {
        super(octets);
    }

    public NGAP_EUTRACellIdentity(byte[] octets, int bitLength) {
        super(octets, bitLength);
    }

    public NGAP_EUTRACellIdentity(byte[] octets) {
        super(octets);
    }

    public NGAP_EUTRACellIdentity(String hex, int bitLength) {
        super(hex, bitLength);
    }

    public NGAP_EUTRACellIdentity(String bits) {
        super(bits);
    }

    @Override
    protected String getAsnName() {
        return "EUTRACellIdentity";
    }

    @Override
    protected String getXmlTagName() {
        return "EUTRACellIdentity";
    }
}