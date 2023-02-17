package model;

public class Nedboer {

    public static void main(String[] args) {
        System.out.println();

        System.out.println(bedsteTreFerieUger());


    }

    private static int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};


    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    public static int bedsteTreFerieUger() {
        int bedsteUge = Integer.MAX_VALUE;
        int mindsteNedboer = bedsteUge;

        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            int mængde = nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];
            if (mængde < mindsteNedboer) {
                bedsteUge = i + 1;
                mindsteNedboer = mængde;
            }
        }
        return bedsteUge;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    public int bedsteFerieUgerStart(int antal) {
        int bedsteUge = Integer.MAX_VALUE;
        int mindsteNedboer = bedsteUge;

        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            int mængdeForUge = 0;
            for (int j = 0; j < antal; j++) {
                mængdeForUge += nedboerPrUge[i + j];
            }

            if (mængdeForUge < mindsteNedboer) {
                bedsteUge = i + 1;
                mindsteNedboer = mængdeForUge;
            }
        }
        return bedsteUge;

    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer() {
        int førsteUgeNr = 0;
        int flestEns = 0;
        int counter = 0;
        for (int i = 0; i < nedboerPrUge.length; i++) {
            if (nedboerPrUge[i] == nedboerPrUge[i + 1]){
                counter++;
            } else if (flestEns < counter) {
                flestEns = counter;
                førsteUgeNr = i - counter;
                counter = 0;

            }else {
                counter = 0;
            }
        }
        return førsteUgeNr + 1;
    }
}
