package tr.havelsan.ueransim.ngap4.ies.enumerations;

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

public class NGAP_RRCState extends NgapEnumerated {

    public static final NGAP_RRCState INACTIVE = new NGAP_RRCState("inactive");
    public static final NGAP_RRCState CONNECTED = new NGAP_RRCState("connected");

    protected NGAP_RRCState(String sValue) {
        super(sValue);
    }

    @Override
    protected String getAsnName() {
        return "RRCState";
    }

    @Override
    protected String getXmlTagName() {
        return "RRCState";
    }
}