public class UrlHash {

    private String url;
    private String hash;

    UrlHash(String url, String hash) {
        this.url = url;
        this.hash = hash;
    }

    public String getUrl() {
        return this.url;
    }

    public String getHash() {
        return this.hash;
    }
}
