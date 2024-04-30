package hexlet.code;

public class Rational {
    private int numer;
    private int denom;

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    public Rational(int numer, int denom) {
        int nod = Utils.gcd(numer, denom);
        this.numer = numer / nod;
        this.denom = denom / nod;
    }

    @Override
    public String toString() {
        return "" + numer + "/" + denom;
    }

    public Rational add(Rational rat) {
        int tekDenom = denom;
        int tekNumer = numer + rat.getNumer();
        if (denom != rat.getDenom()) {
            tekDenom = denom * rat.getDenom();
            tekNumer = numer * rat.getDenom() + rat.getNumer() * denom;
        }
        int nod = Utils.gcd(tekNumer, tekDenom);
        return new Rational(tekNumer / nod, tekDenom / nod);
    }
    public Rational sub(Rational rat){
        int tekDenom = denom;
        int tekNumer = numer - rat.getNumer();
        if (denom != rat.getDenom()) {
            tekDenom = denom * rat.getDenom();
            tekNumer = numer * rat.getDenom() - rat.getNumer() * denom;
        }
        int nod = Utils.gcd(tekNumer, tekDenom);
        return new Rational(tekNumer / nod, tekDenom / nod);
    }
}
