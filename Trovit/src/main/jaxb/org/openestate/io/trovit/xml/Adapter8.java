
package org.openestate.io.trovit.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseLatitudeValue(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.trovit.TrovitUtils.printLatitudeValue(value));
    }

}
