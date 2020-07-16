package tr.havelsan.ueransim.ngap4.ies.integers;

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

public class NGAP_NumberOfBroadcasts extends NgapInteger {

    public NGAP_NumberOfBroadcasts(long value) {
        super(value);
    }

    public NGAP_NumberOfBroadcasts(Octet value) {
        super(value);
    }

    public NGAP_NumberOfBroadcasts(Octet2 value) {
        super(value);
    }

    public NGAP_NumberOfBroadcasts(Octet3 value) {
        super(value);
    }

    public NGAP_NumberOfBroadcasts(Octet4 value) {
        super(value);
    }

    @Override
    protected String getAsnName() {
        return "NumberOfBroadcasts";
    }

    @Override
    protected String getXmlTagName() {
        return "NumberOfBroadcasts";
    }
}