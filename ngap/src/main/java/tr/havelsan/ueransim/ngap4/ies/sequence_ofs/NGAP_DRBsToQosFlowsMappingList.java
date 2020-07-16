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

public class NGAP_DRBsToQosFlowsMappingList extends NgapSequenceOf<NGAP_DRBsToQosFlowsMappingItem> {

    public NGAP_DRBsToQosFlowsMappingList() {
        super();
    }

    public NGAP_DRBsToQosFlowsMappingList(List<NGAP_DRBsToQosFlowsMappingItem> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "DRBsToQosFlowsMappingList";
    }

    @Override
    protected String getXmlTagName() {
        return "DRBsToQosFlowsMappingList";
    }

    @Override
    public Class<NGAP_DRBsToQosFlowsMappingItem> getItemType() {
        return NGAP_DRBsToQosFlowsMappingItem.class;
    }
}