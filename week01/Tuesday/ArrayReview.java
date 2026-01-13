
public class ArrayReview {
    public static void main(String[] args) {
        // when you define an array
        // MUST give it a size
        String[] goodTeams = new String[8];
        goodTeams[0] = "49ers";
        goodTeams[1] = "Buffalo";

        System.out.println("All the good teams!");

        for (int i = 0; i < goodTeams.length; i++) {
            System.out.println(goodTeams[i]);
        }

        // size can be explicit or implicit

        String[] badTeams = {
                "Eagles",
                "Dallas"
        };

        System.out.println("All the bad teams: ");

        for (String badTeam: badTeams) {
            System.out.println(badTeam);
        }

        int[] scores = {16, 0, 25, 2};

        for (int score: scores) {
            System.out.println(score);
        }

    }
}
