import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//

        BufferedReader reader = new BufferedReader(new FileReader("packages.csv"));
        List<Packet> packages = new ArrayList<>();
        String line;

        while((line = reader.readLine()) != null){

            List<String> tokens = Arrays.asList(line.split(",", 4));
            Packet packet = new Packet(tokens.get(0), tokens.get(1), tokens.get(2), tokens.get(3));
            packages.add(packet);
        }

        for (int i = 0; i < packages.size(); i++) {
            System.out.println(packages.get(i).getTargetLocation());
        }



    }
}
