// Denne class nedarver fra Kød klassen og har herudover nogle parametre som kun gør sig gældende for Beef class.
// Der er implimenteret et interface som specificere tilberedning af kødet

public class Beef extends Kød implements Processing {

    String type = "Black Angus";
    int weight = 200;


    @Override
    public void tilberedning() {
        System.out.println("Kødet skal have en kerne temperatur på 50-70c");
    }
}
