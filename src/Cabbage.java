// Denne class nedarver fra Grønsag klassen og har herudover nogle parametre som kun gør sig gældende for Cabbage class
// Der er implimenteret et interface som specificere rensning af grøntsagen
public class Cabbage extends Grønsag implements RinsingIntructions {
    String type = "Økologisk Kål";

    @Override
    public void rensningAfGrøntsager() {
        System.out.println("Skyl grøntsagen under koldt vand");
    }
}
