package legoset;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="weight")
@XmlAccessorType(XmlAccessType.FIELD)

public class Weight
    {
    @XmlAttribute
    private String unit;
    @XmlValue
    private double value;

    public Weight(String unit, double value)
        {
        this.unit = unit;
        this.value = value;
        }

    public Weight()
        {
        }

    public String getUnit()
        {
        return unit;
        }

    public void setUnit(String unit)
        {
        this.unit = unit;
        }
    }
