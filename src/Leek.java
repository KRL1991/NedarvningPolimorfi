// Denne class nedarver fra Grønsag class og har en metode som gør sig gældende for Leek class
// Der er implimenteret et interface som specificere rensning af grøntsagen
public class Leek extends Grønsag implements RinsingIntructions {
    String type = "Økologiske Porer";

    @Override
    public void rensningAfGrøntsager() {
        System.out.println("Skyl grøntsagen under koldt vandt");
    }
}
