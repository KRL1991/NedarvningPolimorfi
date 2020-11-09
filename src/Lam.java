// Denne class nedarver fra Kød klassen og har herudover nogle parametre som kun gør sig gældende for Lam class
// Der er implimenteret et interface som specificere tilberedning af kødet
public class Lam extends Kød implements Processing {

    String type = "New Zealand";
    int weight = 250;

    @Override
    public void tilberedning() {
        System.out.println("Kødet skal have en kerne temperatur på 75c");
    }
}
