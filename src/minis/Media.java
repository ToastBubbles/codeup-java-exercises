package minis;

abstract class Media {
    protected boolean isCheckedOut;
    protected String name;
    protected String genre;
    /**
     * Consider a library. In the library, there are various forms of media accessible to the public. A patron of a library can access
     * newspapers, books, microfiche, magazines, records, cds, etc.
     * Create a Media abstract class
     *   Identify at least one process that can be done the same way for each form of media. Add a public
     *   void instance method named after this thing and give it a message to print simply print out generally describing this process.
     *   Identify at least one process that be done for each form of media but requires a unique approach / implementation for each specific
     *   sub-type of media. Create an abstract method that defines method signiture for this process but does not include the method body.
     * Extend from Media with one of the above listed sub-types of media
     *   Include an implementation (method body) of the abstract method created in the Media class
     * BONUS: identify and add another abstract method to the Media class and extend the Media class in additional sub-types
     */
    public Media(){
        this.name = "no name";
        this.genre = "no genre";
        this.isCheckedOut = false;
    }
    public Media(String name, String genre){
        this.name = name;
        this.genre = genre;
        this.isCheckedOut = false;
    }
    public Media(String name, String genre, boolean checkedOut){
        this.name = name;
        this.genre = genre;
        this.isCheckedOut = checkedOut;
    }

    abstract protected void read();

    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public boolean getCheckedOut(){
        return isCheckedOut;
    }


    public void checkOut(){
        if(isCheckedOut){
            System.out.println("it's already gone mate");
        }else {
            System.out.printf("you checked out %s%n", this.name);
        }
    }

}
