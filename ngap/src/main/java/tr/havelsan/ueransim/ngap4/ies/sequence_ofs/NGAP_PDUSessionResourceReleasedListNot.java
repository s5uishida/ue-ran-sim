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

public class NGAP_PDUSessionResourceReleasedListNot extends NgapSequenceOf<NGAP_PDUSessionResourceReleasedItemNot> {

    public NGAP_PDUSessionResourceReleasedListNot() {
        super();
    }

    public NGAP_PDUSessionResourceReleasedListNot(List<NGAP_PDUSessionResourceReleasedItemNot> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "PDUSessionResourceReleasedListNot";
    }

    @Override
    protected String getXmlTagName() {
        return "PDUSessionResourceReleasedListNot";
    }

    @Override
    public Class<NGAP_PDUSessionResourceReleasedItemNot> getItemType() {
        return NGAP_PDUSessionResourceReleasedItemNot.class;
    }
}