public class Main {

    public static void main(String[] args) {

        UrlHasher urlHasherObj = null;
        urlHasherObj = new UrlHasher();

        urlHasherObj.saveUrl("delfi.ee");
        urlHasherObj.saveUrl("neti.ee");
        urlHasherObj.saveUrl("telia.ee");

        for (int i = 0; i < urlHasherObj.getUrlDb().size(); i++){
            System.out.println(urlHasherObj.getUrlDb().get(i).getUrl() + " - " + urlHasherObj.getUrlDb().get(i).getHash());
        }
    }
}