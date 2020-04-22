package legoset;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="minifigs")
@XmlAccessorType(XmlAccessType.FIELD)

public class Minifig
    {
    @XmlAttribute
    private int count;
    @XmlValue
    private String minifigName;

    public Minifig(int count, String minifigName)
        {
        this.count = count;
        this.minifigName = minifigName;
        }

    public Minifig()
        {
        }

    public int getCount()
        {
        return count;
        }

    public void setCount(int count)
        {
        this.count = count;
        }

    public String getMinifigName()
        {
        return minifigName;
        }

    public void setMinifigName(String minifigName)
        {
        this.minifigName = minifigName;
        }
    }
