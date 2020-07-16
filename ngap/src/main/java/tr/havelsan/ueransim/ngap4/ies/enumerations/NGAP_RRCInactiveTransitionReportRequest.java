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

public class NGAP_RRCInactiveTransitionReportRequest extends NgapEnumerated {

    public static final NGAP_RRCInactiveTransitionReportRequest SUBSEQUENT_STATE_TRANSITION_REPORT = new NGAP_RRCInactiveTransitionReportRequest("subsequent-state-transition-report");
    public static final NGAP_RRCInactiveTransitionReportRequest SINGLE_RRC_CONNECTED_STATE_REPORT = new NGAP_RRCInactiveTransitionReportRequest("single-rrc-connected-state-report");
    public static final NGAP_RRCInactiveTransitionReportRequest CANCEL_REPORT = new NGAP_RRCInactiveTransitionReportRequest("cancel-report");

    protected NGAP_RRCInactiveTransitionReportRequest(String sValue) {
        super(sValue);
    }

    @Override
    protected String getAsnName() {
        return "RRCInactiveTransitionReportRequest";
    }

    @Override
    protected String getXmlTagName() {
        return "RRCInactiveTransitionReportRequest";
    }
}