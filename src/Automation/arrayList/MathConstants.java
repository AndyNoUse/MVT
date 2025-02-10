package Automation.arrayList;

import java.util.ArrayList;

//Namn	Värde
//pi		3.1415926535
//e		    2.7182818284
//sqrt2	    1.4142135623
//phi		1.6180339887
//ln10		2.3025850929
public class MathConstants {
    public static void main(String[] args) {
        ArrayList<Double> constants = new ArrayList<>(); //Objekt inom ArrayListen

        System.out.println(constants.add(3.1415926535));
        constants.add(Math.E);
        constants.add(1.4142135623);//        constants.add(0,1.4142135623);
        constants.add(1.6180339887);
        constants.add(2.3025850929);

        System.out.println(constants);
        System.out.println(constants.indexOf(1.4142135623)); //Vilken plats blah blah har som index.
        constants.remove(constants.size()-2); //tar bort näst sista indexet
        System.out.println(constants);
        System.out.println(constants.reversed());
        ArrayList<Double> constantsClone = (ArrayList<Double>) constants.clone();
        System.out.println(constantsClone);

        constantsClone.removeAll(constantsClone); //Ladda in en annan listas nummer för att ta bort liknande nummer.
        //fungerar också med Strängar. CaseSensative.

        constants.clear();
        System.out.println(constantsClone);
        System.out.println(constants);
        System.out.println(constants.equals(constantsClone));


        //Skriva ut alla namnen som har sparats
        //
        //Skriva över med ett nytt namn på första platsen i ArrayList
        //
        //Byta plats på första och sista namnet
    }
}
