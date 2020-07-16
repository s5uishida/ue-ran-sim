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

public class NGAP_PDUSessionResourceReleasedListPSAck extends NgapSequenceOf<NGAP_PDUSessionResourceReleasedItemPSAck> {

    public NGAP_PDUSessionResourceReleasedListPSAck() {
        super();
    }

    public NGAP_PDUSessionResourceReleasedListPSAck(List<NGAP_PDUSessionResourceReleasedItemPSAck> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceReleasedListPSAck";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceReleasedListPSAck";
    }

    @Override
    public Class<NGAP_PDUSessionResourceReleasedItemPSAck> getItemType() {
        return NGAP_PDUSessionResourceReleasedItemPSAck.class;
    }
}