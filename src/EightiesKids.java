public class EightiesKids {
    public static void main(String[] args) {
        System.out.println(bucketOf("water"));
        System.out.println(bucketOf("slime"));
        System.out.println(bucketOf("Will I get wet? I don't know."));
        System.out.println(bucketOf("This should be safe"));
    }

    private static String bucketOf(String said){
        String minus = said.toLowerCase();
        if ((minus.contains("water")||minus.contains("wet")||minus.contains("wash"))&&(minus.contains("i don't know")||minus.contains("slime"))) {
            return "sludge";
        } else if (minus.contains("i don't know")||minus.contains("slime")) {
            return "slime";
        } else if (minus.contains("water")||minus.contains("wet")||minus.contains("wash")) {
            return "water";
        } else {
            return "air";
        }
    }
}
