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

public class NGAP_UnavailableGUAMIList extends NgapSequenceOf<NGAP_UnavailableGUAMIItem> {

    public NGAP_UnavailableGUAMIList() {
        super();
    }

    public NGAP_UnavailableGUAMIList(List<NGAP_UnavailableGUAMIItem> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "UnavailableGUAMIList";
    }

    @Override
    protected String getXmlTagName() {
        return "UnavailableGUAMIList";
    }

    @Override
    public Class<NGAP_UnavailableGUAMIItem> getItemType() {
        return NGAP_UnavailableGUAMIItem.class;
    }
}