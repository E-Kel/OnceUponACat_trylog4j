package onceUponACat.cat;

abstract public class Cat {
    protected String breed;
    protected String name;

    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String stringReplyFormat(String str) {
        str = "[" + str + "]: ";
        return str;
    }


}


