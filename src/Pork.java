// Denne class nedarver fra Kød klassen og har herudover nogle parametre som kun gør sig gældende for Pork class
// Der er implimenteret et interface som specificere tilberedning af kødet
public class Pork extends Kød implements Processing {

    String type = "Free range Danish Pork";
    int weight = 300;

    @Override
    public void tilberedning() {

        System.out.println("Kødet skal have en kerne temperatur på 65c");

    }
}
