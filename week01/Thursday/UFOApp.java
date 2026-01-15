import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UFOApp {

    public static void main(String[] args) {
        final int MAX_NUM_SIGHTINGS = 100;

        UFOSighting[] sightings = new UFOSighting[MAX_NUM_SIGHTINGS];
        Scanner keyboard = new Scanner(System.in);
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

            for (int i = 0; i < MAX_NUM_SIGHTINGS; i++) {
                String line = fileInput.nextLine();

                // safeguard against if there is a comma
                // in the data itself
                // being used NOT as a separator
                String[] ufoData = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                String ufoData_state = ufoData[2];
                String ufoData_country = ufoData[3];
                String duration = ufoData[5].trim();

                UFOSighting sighting = new UFOSighting(ufoData_state, ufoData_country, Integer.parseInt(duration));

                sightings[i] = sighting;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            System.out.println("What state do you want to check?");
            String state = keyboard.next();

            System.out.println("How many UFO sightings in " + state + "?");

            int stateSightings = 0;
            for (int i = 0; i < sightings.length; i++) {
                if (sightings[i].getState().equals(state)) {
                    stateSightings++;
                }
            }

            System.out.println("There were: " + stateSightings + " sightings.");
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

    private boolean verified = true;

    public UFOSighting(String state, String country, int duration) {
        if (state.equals("")) {
            this.state = "n/a";
        } else {
            this.state = state;
        }
        this.country = country;
        this.duration = duration;
    }

    public void debunk() {
        verified = false;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getShape() {
        return shape;
    }

    public int getDuration() {
        return duration;
    }

    public String getDurationMinHours() {
        return durationMinHours;
    }

    public String getComments() {
        return comments;
    }

    public String getDate_posted() {
        return date_posted;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "UFOSighting{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                '}';
    }
}
