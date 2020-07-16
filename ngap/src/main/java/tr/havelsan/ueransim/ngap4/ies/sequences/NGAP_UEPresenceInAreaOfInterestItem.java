package tr.havelsan.ueransim.ngap4.ies.sequences;

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

public class NGAP_UEPresenceInAreaOfInterestItem extends NgapSequence {

    public NGAP_LocationReportingReferenceID locationReportingReferenceID;
    public NGAP_UEPresence uEPresence;

    @Override
    protected String getAsnName() {
        return "UEPresenceInAreaOfInterestItem";
    }

    @Override
    protected String getXmlTagName() {
        return "UEPresenceInAreaOfInterestItem";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"locationReportingReferenceID", "uEPresence"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"locationReportingReferenceID", "uEPresence"};
    }
}