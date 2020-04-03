package onceUponACat.cat;

public class WildCat extends Cat implements Playable {
    private String hatePhrase;
    private String saveTheWorldPhrase;
    private String playPhrase;

    public WildCat(String breed, String name, String hatePhrase, String playPhrase, String saveTheWorldPhrase) {
        super(breed, name);
        this.hatePhrase = hatePhrase;
        this.playPhrase =playPhrase;
        this.saveTheWorldPhrase = saveTheWorldPhrase;
    }

    public void hatePeople() {
        System.out.println(name + ": " + hatePhrase);

    }

    public void saveWorld() {
        System.out.println(name + ": " + saveTheWorldPhrase);
    }

    public String getHatePhrase() {
        return hatePhrase;
    }

    public void setHatePhrase(String hatePhrase) {
        this.hatePhrase = hatePhrase;
    }

    public String getSaveTheWorldPhrase() {
        return saveTheWorldPhrase;
    }

    public void setSaveTheWorldPhrase(String saveTheWorldPhrase) {
        this.saveTheWorldPhrase = saveTheWorldPhrase;
    }

    public String getPlayPhrase() {
        return playPhrase;
    }

    public void setPlayPhrase(String playPhrase) {
        this.playPhrase = playPhrase;
    }
    @Override
    public void play() {
        System.out.println(name + ": " + playPhrase);
    }
}
