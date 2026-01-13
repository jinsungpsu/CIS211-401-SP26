import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UFOApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File ufoFile = new File("UFO_sightings.csv");
        try {
            Scanner fileInput = new Scanner(ufoFile);
            System.out.println(fileInput.nextLine());
//            while (fileInput.hasNextLine()) {
//                // as long as there's some stuff
//                // in there, keep going
//                String line = fileInput.nextLine();
//                System.out.println(line);
//            }
            for (int i = 0; i < 100; i++) {
                String line = fileInput.nextLine();

                // safeguard against if there is a comma
                // in the data itself
                // being used NOT as a separator
                String[] ufoData = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                String ufoData_city = ufoData[1];
                String ufoData_state = ufoData[2];
                String duration = ufoData[5].trim();

                UFOSighting sighting = new UFOSighting(ufoData_city, ufoData_state, Integer.parseInt(duration));

                System.out.println(sighting);


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class UFOSighting {
    private String datetime; // 0
    private String city;    // 1
    private String state;   // 2
    private String country; // 3
    private String shape;   // 4
    private int duration;   // 5
    private String durationMinHours;
    private String comments;
    private String date_posted;
    private float latitude;
    private float longitude;

    public UFOSighting(String state, String country, int duration) {
        this.state = state;
        this.country = country;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "UFOSighting{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", duration=" + duration +
                '}';
    }
}
