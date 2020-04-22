package legoset;
import movie.YearAdapter;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;


@XmlRootElement(name="legoSet")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces","tags","minifigs","weight","url"})

public class LegoSet
    {
    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;
    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    private Weight weight;
    private String url;
    @XmlAttribute
    private int number;

    public String getName()
        {
        return name;
        }

    public void setName(String name)
        {
        this.name = name;
        }

    public String getTheme()
        {
        return theme;
        }

    public void setTheme(String theme)
        {
        this.theme = theme;
        }

    public String getSubtheme()
        {
        return subtheme;
        }

    public void setSubtheme(String subtheme)
        {
        this.subtheme = subtheme;
        }

    public Year getYear()
        {
        return year;
        }

    public void setYear(Year year)
        {
        this.year = year;
        }

    public int getPieces()
        {
        return pieces;
        }

    public void setPieces(int pieces)
        {
        this.pieces = pieces;
        }

    public Set<String> getTags()
        {
        return tags;
        }

    public void setTags(Set<String> tags)
        {
        this.tags = tags;
        }

    public List<Minifig> getMinifigs()
        {
        return minifigs;
        }

    public void setMinifigs(List<Minifig> minifigs)
        {
        this.minifigs = minifigs;
        }

    public Weight getWeight()
        {
        return weight;
        }

    public void setWeight(Weight weight)
        {
        this.weight = weight;
        }

    public String getUrl()
        {
        return url;
        }

    public void setUrl(String url)
        {
        this.url = url;
        }

    public int getNumber()
        {
        return number;
        }

    public void setNumber(int number)
        {
        this.number = number;
        }
    }
