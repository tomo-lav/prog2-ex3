package jp.ac.uryukyu.ie.e0928;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze {

    private char m_x;
    private char m_y;
    private char p_x;
    private char p_y;

    private int mazex;
    private int mazey;
    private int playerx;
    private int playery;

    public Maze(){
        this.mazex = (int)m_x;
        this.mazey = (int)m_y;
    }

    public int getPlayerx() {
        return playerx;
    }

    public int getPlayery(){
        return playery;
    }

    public void Inputmap() {
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
        String str = strings.get(0);
        String Str = strings.get(1);

        m_x = Str.charAt(0);
        m_y = Str.charAt(2);
        p_x = str.charAt(0);
        p_y = str.charAt(2);
    }
}
