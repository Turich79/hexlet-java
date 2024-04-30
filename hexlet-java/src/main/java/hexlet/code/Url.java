package hexlet.code;

public class Url {
    private String host;
    private String protokol;
    Url(String ur){
        String[] mas = ur.split("://");
        this.protokol = mas[0];
        this.host = mas[1];
    }

    public String getHost() {
        return host;
    }

    public String getProtokol() {
        return protokol;
    }
}
