public class ServerNameGenerator {
    private static final String[] adjectives = {
            "big",
            "scary",
            "smelly",
            "blue",
            "painted",
            "colossal",
            "polkadotted",
            "pointy",
            "bulky"
    };
    private static final String[] nouns = {
            "rock",
            "pencil",
            "boocha",
            "cup",
            "phone",
            "computer",
            "crumb",
            "crust",
            "apple"
    };
    public static void main(String[] args) {

        System.out.println(genWord());
    }

    public static String genWord(){
        return adjectives[randInt(adjectives.length)] + " " + nouns[randInt(nouns.length)];
    }
    private static int randInt(int max){
        return (int) (Math.random()* max);
    }
}
