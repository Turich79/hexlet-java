package hexlet.code;

public class Random {
    private int startNum;
    private int[] masPseudo;
    private int tekN;

    public Random(int startNum) {
        this.startNum = startNum;
        int sizeMas = 10;
        masPseudo = new int[sizeMas];
        masPseudo[0] = startNum;
        int mod = 7;
        // Multiplier term
        int multiplier = 6;
        // Increment term
        int inc = 3;
        for (int i = 1; i < sizeMas; i++) {
            masPseudo[i] = ((masPseudo[i - 1] * multiplier) + inc) % mod;
        }
    }

    public int getNext() {
        tekN++;
        if (tekN == masPseudo.length) {
            tekN = 0;
        }
        return masPseudo[tekN];
    }

    public void reset() {
        tekN = 0;
    }

}
