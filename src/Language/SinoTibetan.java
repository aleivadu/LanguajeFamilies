package Language;

public class SinoTibetan extends Language{
    public SinoTibetan(String name, int numSpearker){
        super(name, numSpearker,"Asian","subjec-object-verb");
        if (this.name.contains("chinese" )){
            this.wordOrder = "subject-verb-object";
        }
    }
}
