/**
 * clase Utilidades 
 * incluye  m�todos est�ticos para trabajar con String
 * @author - Julen Baztarrica
 */ 


public class Utilidades {

    /**
     * Dada una cadena devuelve una nueva capitalizando los caracteres de
     * tres en tres de forma
     * alterna empezando por may�scula (may�scula, min�scula, may�scula,
     * min�scula, ....) 
     * Ej. si la cadena recibida es "texto" devuelve "TEXto"
     * si la cadena recibida es "zapato" devuelve "ZAPato"
     * si la cadena recibida es "de" devuelve "DE"
     */

    public static String capitalizarAlterna(String cadena) {
        //TODO

        return null;
    }

    /**
     * Dada una cadena devuelve true si hay letras repetidas, false en otro caso
     * Es indiferente may�sculas o min�sculas
     *
     * Pista!! puedes hacer de forma sencilla este m�todo con ayuda de
     * indexOf y substring
     *
     */
    public static boolean tieneLetrasRepetidas(String cadena) {
        cadena = cadena.toLowerCase();
        int pos = 0;
        pos = cadena.indexOf(cadena);
        while (pos != -1) {
            pos = cadena.indexOf(cadena,pos+1);
            if(cadena.indexOf(cadena,pos+1) > 1){
                return true;
            }
            
        }
        return false;
    }

    /**
     *
     */
    public static void main(String[] args) {
        String cadena = "zaPaTo";
        System.out.println(cadena + "\tCapitalizada alterna: " +
            Utilidades.capitalizarAlterna(cadena));
        cadena = "pez";
        System.out.println(cadena + "\tCapitalizada alterna: " +
            Utilidades.capitalizarAlterna(cadena));

        cadena = "vaso";
        System.out.println(cadena + "\tCapitalizada alterna: " +
            Utilidades.capitalizarAlterna(cadena));

        cadena = "semana";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
            Utilidades.tieneLetrasRepetidas(cadena));

        cadena = "quebrantos";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
            Utilidades.tieneLetrasRepetidas(cadena));

        cadena = "y";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
            Utilidades.tieneLetrasRepetidas(cadena));

        cadena = "de";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
            Utilidades.tieneLetrasRepetidas(cadena));

    }
}
