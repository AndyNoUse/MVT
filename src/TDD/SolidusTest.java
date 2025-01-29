package TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolidusTest {

    //Det finns en intern valuta ”solidus” som man kan göra uttag ifrån.
    // Man kan såklart enbart göra så stort uttag som man har ”råd med”.
    // Alla börjar med 5 solidus och när man blir gold member får man 20 solidus automatiskt.
    // Användarna vill såklart kunna ta reda på hur många solidus de har.
    // Varje gång man loggar in får man en solidus.
    // Med solidus kan man köpa merch: hoodie kostar 20 solidus, t-shirt 15 solidus och stickers 5 solidus.
    // Detta är en massa funktioner, utveckla dem därför med flera steg enligt TDD
/*
    @Test
    public void solidusNewUserDefaultMoney(){
        Solidus solidus = new Solidus();
        solidus.newUser();
        assertEquals(5,solidus.getSolidus());
    }

 */
}
