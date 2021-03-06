package jp.ac.uryukyu.ie.e0928;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExMain {
    public static void main(String[] args) {

        String filename = "./src/main/jp/ac/uryukyu/ie/e0928/map.txt";
        List<String> strings = new ArrayList<>();
        Scanner scanner;

        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        System.out.println(strings);

        Player player = new Player();
        Maze maze = new Maze();

    }
}

