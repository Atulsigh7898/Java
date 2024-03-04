import java.util.Arrays;

public class BagOfTokens {
    private int[] tokens;
    private int score;

    public BagOfTokens(int[] tokens) {
        this.tokens = tokens;
        this.score = 0;
        Arrays.sort(this.tokens);
    }

    public int bagOfTokensScore(int P) {
        int maxScore = 0;
        int currentScore = 0;
        int i = 0;
        int j = tokens.length - 1;

        while (i <= j) {
            if (P >= tokens[i]) {
                P -= tokens[i];
                currentScore++;
                maxScore = Math.max(maxScore, currentScore);
                i++;
            } else if (currentScore > 0) {
                P += tokens[j];
                currentScore--;
                j--;
            } else {
                break;
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        int[] tokens = {100, 200, 300, 400};
        int P = 200;
        BagOfTokens bag = new BagOfTokens(tokens);
        int maxScore = bag.bagOfTokensScore(P);
        System.out.println("Max score: " + maxScore);
    }
}
