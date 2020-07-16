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

public class NGAP_UL_NGU_UP_TNLModifyItem extends NgapSequence {

    public NGAP_UPTransportLayerInformation uL_NGU_UP_TNLInformation;
    public NGAP_UPTransportLayerInformation dL_NGU_UP_TNLInformation;

    @Override
    protected String getAsnName() {
        return "UL-NGU-UP-TNLModifyItem";
    }

    @Override
    protected String getXmlTagName() {
        return "UL-NGU-UP-TNLModifyItem";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"uL-NGU-UP-TNLInformation", "dL-NGU-UP-TNLInformation"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"uL_NGU_UP_TNLInformation", "dL_NGU_UP_TNLInformation"};
    }
}