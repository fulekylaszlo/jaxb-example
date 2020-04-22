package legoset;
import jaxb.JAXBHelper;
import java.util.List;
import java.util.Set;
import java.io.FileOutputStream;
import java.time.Year;


public class Main
    {
    public static void main(String[] args) throws Exception
        {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter","Stormtrooper","Star Wars","Solo"));
        legoset.setMinifigs(List.of(new Minifig(2,"Imperial Mudtrooper"),new Minifig(1,"Imperial Pilot"),new Minifig(1,"Mimban Mudtrooper")));
        legoset.setWeight(new Weight("kg",0.89));
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoset.setNumber(75211);

        JAXBHelper.toXML(legoset, System.out);
        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));

        }
    }
