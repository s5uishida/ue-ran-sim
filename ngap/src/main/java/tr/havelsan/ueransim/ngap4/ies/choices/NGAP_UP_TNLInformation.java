package tr.havelsan.ueransim.ngap4.ies.choices;

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

public class NGAP_UP_TNLInformation extends NgapChoice {

    public NGAP_SingleTNLInformation singleTNLInformation;
    public NGAP_MultipleTNLInformation multipleTNLInformation;

    @Override
    protected String getAsnName() {
        return "UP-TNLInformation";
    }

    @Override
    protected String getXmlTagName() {
        return "UP-TNLInformation";
    }

    @Override
    protected String[] getMemberNames() {
        return new String[]{"singleTNLInformation", "multipleTNLInformation"};
    }

    @Override
    protected String[] getMemberIdentifiers() {
        return new String[]{"singleTNLInformation", "multipleTNLInformation"};
    }
}