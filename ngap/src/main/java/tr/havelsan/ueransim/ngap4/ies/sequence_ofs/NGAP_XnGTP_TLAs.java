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

public class NGAP_XnGTP_TLAs extends NgapSequenceOf<NGAP_TransportLayerAddress> {

    public NGAP_XnGTP_TLAs() {
        super();
    }

    public NGAP_XnGTP_TLAs(List<NGAP_TransportLayerAddress> value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "XnGTP-TLAs";
    }

    @Override
    protected String getXmlTagName() {
        return "XnGTP-TLAs";
    }

    @Override
    public Class<NGAP_TransportLayerAddress> getItemType() {
        return NGAP_TransportLayerAddress.class;
    }
}