import Language.*;

public class Main {
    public static void main(String[] args) {
        Language myLang = new Language("chibchombiano",50000000,"south America", "sujeto - verbo - predicado");
        myLang.getInfo();
        Mayan akatek = new Mayan(  "akatec", 45430);
        akatek.getInfo();
        SinoTibetan mandarin = new SinoTibetan("chinese mandarin", 114000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("burmese", 42900000);
        burmese.getInfo();
    }
}
