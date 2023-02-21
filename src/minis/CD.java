package minis;

public class CD extends Media{

    public CD(String name, String genre){
        this(name,genre,false);
    }
    public CD(String name, String genre, boolean checkedOut){
        super(name,genre,checkedOut);
    }

    @Override
    protected void read() {
        System.out.println("you need a cd player for this!");
    }
}
