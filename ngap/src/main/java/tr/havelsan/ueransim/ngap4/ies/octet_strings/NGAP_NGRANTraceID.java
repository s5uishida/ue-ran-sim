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

public class NGAP_NGRANTraceID extends NgapOctetString {

    public NGAP_NGRANTraceID(OctetString value) {
        super(value);
    }

    public NGAP_NGRANTraceID(BitString value) {
        super(value);
    }

    public NGAP_NGRANTraceID(Octet[] octets) {
        super(octets);
    }

    public NGAP_NGRANTraceID(int[] octetInts) {
        super(octetInts);
    }

    public NGAP_NGRANTraceID(byte[] octetBytes) {
        super(octetBytes);
    }

    public NGAP_NGRANTraceID(String hex) {
        super(hex);
    }

    @Override
    protected String getAsnName() {
        return "NGRANTraceID";
    }

    @Override
    protected String getXmlTagName() {
        return "NGRANTraceID";
    }
}