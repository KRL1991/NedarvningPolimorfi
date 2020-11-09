import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

// Dette er main class og det er her nye objekter laves og deres variabler defineres

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        System.out.println(a.type);
        a.coolDown();

        Banana b = new Banana();
        b.stykpris = 4;
        b.moden = true;
        b.holdbarhed = new Date(1608768000);
        System.out.println(b.sort);
        b.coolDown();

        Grape g = new Grape();
        g.stykpris = 1;
        g.moden = true;
        g.holdbarhed = new Date(1608768000);
        System.out.println(g.type);
        g.coolDown();

        Strawberry s = new Strawberry();
        s.stykpris = 3;
        s.moden = true;
        s.holdbarhed = new Date(1608768000);
        System.out.println(s.sort);
        s.coolDown();



        Cabbage c = new Cabbage();
        c.stykpris = 8;
        c.holdbarhed = new Date(1608768000);
        c.freeze();
        System.out.println(c.type);

        Leek l = new Leek();
        l.stykpris = 5;
        l.holdbarhed = new Date(1608768000);
        System.out.println(l.type);
        l.freeze();

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        System.out.println(p.type);
        p.freeze();


        Beef beef = new Beef();
        beef.stykpris = 30;
        beef.holdbarhed = new Date(1608768000);
        beef.weight = 200;
        System.out.println(beef.type);
        beef.coolDown();

        Lam lam = new Lam();
        lam.stykpris = 45;
        lam.holdbarhed = new Date(1608768000);
        lam.weight = 150;
        System.out.println(lam.type);
        lam.coolDown();

        Pork pork = new Pork();
        pork.stykpris = 35;
        pork.holdbarhed = new Date(1608768000);
        pork.weight = 250;
        System.out.println(pork.type);
        pork.coolDown();



    }

}
