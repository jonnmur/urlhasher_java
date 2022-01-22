import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrlHasher {

    private List<UrlHash> urlDb = new ArrayList<>();

    public List<UrlHash> getUrlDb() {
        return this.urlDb;
    }

    private String createHash() {
        String[] chars = { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        String res = "";

        for (int i = 0; i < 11; i++) {
            Random rand = new Random();
            int randomChar = rand.nextInt(chars.length);
            res += chars[randomChar];
        }

        return res;
    }

    public void saveUrl(String url) {
        String hash = this.createHash();
        UrlHash urlHashObj = null;
        urlHashObj = new UrlHash(url, hash);

        for (int i = 0; i < urlDb.size(); i++){
            while (urlDb.get(i).getHash() == hash) {
                hash = this.createHash();
            }
        }

        this.urlDb.add(urlHashObj);
    }
}
