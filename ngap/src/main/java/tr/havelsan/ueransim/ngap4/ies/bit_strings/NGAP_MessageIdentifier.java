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

public class NGAP_MessageIdentifier extends NgapBitString {

    public NGAP_MessageIdentifier(BitString value) {
        super(value);
    }

    public NGAP_MessageIdentifier(OctetString octetString, int bitLength) {
        super(octetString, bitLength);
    }

    public NGAP_MessageIdentifier(OctetString octetString) {
        super(octetString);
    }

    public NGAP_MessageIdentifier(Octet[] octets, int bitLength) {
        super(octets, bitLength);
    }

    public NGAP_MessageIdentifier(Octet[] octets) {
        super(octets);
    }

    public NGAP_MessageIdentifier(byte[] octets, int bitLength) {
        super(octets, bitLength);
    }

    public NGAP_MessageIdentifier(byte[] octets) {
        super(octets);
    }

    public NGAP_MessageIdentifier(String hex, int bitLength) {
        super(hex, bitLength);
    }

    public NGAP_MessageIdentifier(String bits) {
        super(bits);
    }

    @Override
    protected String getAsnName() {
        return "MessageIdentifier";
    }

    @Override
    protected String getXmlTagName() {
        return "MessageIdentifier";
    }
}