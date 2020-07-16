package tr.havelsan.ueransim.ngap4.ies.sequence_ofs;

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

public class NGAP_PDUSessionResourceToReleaseListHOCmd extends NgapSequenceOf<NGAP_PDUSessionResourceToReleaseItemHOCmd> {

    public NGAP_PDUSessionResourceToReleaseListHOCmd() {
        super();
    }

    public NGAP_PDUSessionResourceToReleaseListHOCmd(List<NGAP_PDUSessionResourceToReleaseItemHOCmd> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceToReleaseListHOCmd";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceToReleaseListHOCmd";
    }

    @Override
    public Class<NGAP_PDUSessionResourceToReleaseItemHOCmd> getItemType() {
        return NGAP_PDUSessionResourceToReleaseItemHOCmd.class;
    }
}