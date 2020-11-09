import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */
// Dette er varer klassen som indholder forskellige parametre som de andre classes kan kalde på

public class Varer {

    double stykpris;
    Date holdbarhed;
    boolean kanSælges = true;

    void smidUd() {
        kanSælges = false;
    }

}
