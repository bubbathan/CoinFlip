public class CoinFlip {
    public static void main(String[] args) {
        int min = 1;
        int max = 2;
        int oneOrTwo = (int) (Math.random() * (max - min + 1) + min);
        String headsOrTails = new String();

        if (oneOrTwo == 1) {
            headsOrTails = "Heads";
        } else if (oneOrTwo == 2) {
            headsOrTails = "Tails";
        }
        System.out.println(headsOrTails);
    }
}
