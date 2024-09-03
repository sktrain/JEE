
package sk.train.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für geschlecht.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="geschlecht">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="W"/>
 *     <enumeration value="M"/>
 *     <enumeration value="U"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "geschlecht")
@XmlEnum
public enum Geschlecht {

    W,
    M,
    U;

    public String value() {
        return name();
    }

    public static Geschlecht fromValue(String v) {
        return valueOf(v);
    }

}
