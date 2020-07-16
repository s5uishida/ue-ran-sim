package tr.havelsan.ueransim.ngap4.ies.octet_strings;

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

public class NGAP_RoutingID extends NgapOctetString {

    public NGAP_RoutingID(OctetString value) {
        super(value);
    }

    public NGAP_RoutingID(BitString value) {
        super(value);
    }

    public NGAP_RoutingID(Octet[] octets) {
        super(octets);
    }

    public NGAP_RoutingID(int[] octetInts) {
        super(octetInts);
    }

    public NGAP_RoutingID(byte[] octetBytes) {
        super(octetBytes);
    }

    public NGAP_RoutingID(String hex) {
        super(hex);
    }

    @Override
    protected String getAsnName() {
        return "RoutingID";
    }

    @Override
    protected String getXmlTagName() {
        return "RoutingID";
    }
}