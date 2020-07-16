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

public class NGAP_AMF_TNLAssociationSetupList extends NgapSequenceOf<NGAP_AMF_TNLAssociationSetupItem> {

    public NGAP_AMF_TNLAssociationSetupList() {
        super();
    }

    public NGAP_AMF_TNLAssociationSetupList(List<NGAP_AMF_TNLAssociationSetupItem> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "AMF-TNLAssociationSetupList";
    }

    @Override
    protected String getXmlTagName() {
        return "AMF-TNLAssociationSetupList";
    }

    @Override
    public Class<NGAP_AMF_TNLAssociationSetupItem> getItemType() {
        return NGAP_AMF_TNLAssociationSetupItem.class;
    }
}