package gr.aueb.cf.ch9;

import java.io.*;

public class Ch9Exercise {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/locations.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:/temp/locationsout.txt"))) {

            String line;
            br.readLine();   // skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String location = parts[0];
                double latitude = Double.parseDouble(parts[1]);
                double longitude = Double.parseDouble(parts[2]);

                bw.write(String.format("{ location: '%s', latitude: %.4f, longitude: %.4f },%n", location, latitude, longitude));
            }

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
