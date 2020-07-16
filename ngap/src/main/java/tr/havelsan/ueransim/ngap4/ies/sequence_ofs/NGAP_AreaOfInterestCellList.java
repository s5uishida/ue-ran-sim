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

public class NGAP_AreaOfInterestCellList extends NgapSequenceOf<NGAP_AreaOfInterestCellItem> {

    public NGAP_AreaOfInterestCellList() {
        super();
    }

    public NGAP_AreaOfInterestCellList(List<NGAP_AreaOfInterestCellItem> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "AreaOfInterestCellList";
    }

    @Override
    protected String getXmlTagName() {
        return "AreaOfInterestCellList";
    }

    @Override
    public Class<NGAP_AreaOfInterestCellItem> getItemType() {
        return NGAP_AreaOfInterestCellItem.class;
    }
}