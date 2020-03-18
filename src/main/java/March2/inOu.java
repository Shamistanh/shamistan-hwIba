package March2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class inOu {
    private static List<String> read(String name) throws IOException {
        File ifile = new File(name);
        FileReader fr = new FileReader(ifile);
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = br.lines().collect(Collectors.toList());
        br.close();
        return lines;
    }
    private static void write(List<String> processed, String name) throws IOException {
        File ofile = new File(name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
        for (String line: processed) {
            bw.write(line);
            bw.write("\n");
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        List<Integer> randoms = generate(100, -30, 30);

        List<String> randoms2 = convertSI(randoms);
        write(randoms2, "file1.txt");
        List<String> contents = read("file1.txt");

        List<Integer> randoms3 = convertIS(contents);
        List<Integer> sorted_randoms = sort(randoms3);
        List<String> sorted_randomss = convertSI(sorted_randoms);
        write(sorted_randomss, "file2.txt");
    }

    private static List<Integer> convertIS(List<String> contents) {
        List<Integer> ls = new ArrayList<>();
        for(String ch : contents){
            ls.add(Integer.parseInt(ch));
        }
        return ls;
    }

    private static List<String> convertSI(List<Integer> randoms) {
        List<String> str=new ArrayList<>();
        for (int i = 0; i <randoms.size() ; i++) {
            str.add(randoms.get(i).toString());
        }

        return str;
    }

    private static List<Integer> sort(List<Integer> randoms2) {
            int temp=0;
        for (int i = 0; i <randoms2.size() ; i++) {
            for (int j = i; j <randoms2.size() ; j++) {
                if(randoms2.get(j)>randoms2.get(i)){
                    temp=randoms2.get(i);
                    randoms2.set(i, randoms2.get(j));
                    randoms2.set(j, temp);
                }

            }
        }
        return randoms2;
    }

    private static List<Integer> generate(int i, int i1, int i2) {
        int rand=0;
        List<Integer> rn = new ArrayList<>();
        for (int j = 0; j <100; j++) {
            rand=(int)(Math.random()*i2*2-(-i1));
            rn.add(rand);
        }

        return rn;
    }
}
