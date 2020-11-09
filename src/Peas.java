/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */
// Denne class nedarver fra Grønsag class og har en metode som gør sig gældende for Peas class
// Der er implimenteret et interface som specificere rensning af grøntsagen
public class Peas extends Grønsag implements RinsingIntructions {

    String type = "Økologiske Ærter";


    @Override
    public void rensningAfGrøntsager() {
        System.out.println("Skyl grøntsagen under koldt vand");
    }
}
