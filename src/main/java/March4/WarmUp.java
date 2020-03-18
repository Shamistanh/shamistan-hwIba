package March4;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WarmUp{
    private static Map<String, List<String>> read(String name) throws IOException {
        File ifile = new File(name);
        FileReader fr = new FileReader(ifile);
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = br.lines().collect(Collectors.toList());
        br.close();
        Map<String, List<String>> data = new HashMap<>();
        for(String line: lines){
            String [] splitted= line.split(":");
            String [] splitted2= splitted[1].split(",");
            ArrayList<String> splitted3= new ArrayList<>();
            for(String s: splitted2){
                splitted3.add(s.trim());
            }
            data.put(splitted[0], splitted3);
        }
        return data;
    }
    private static void write(String name) throws IOException {
        File ofile = new File(name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
        bw.write(process());
        bw.close();
    }

    public static String process() throws IOException {
        Map<String, List<String>> sv = read("subj_verb_.txt");
        Map<String, List<String>> vo = read("verb_obj_.txt");
        String cml="";


        for(String s: sv.keySet()){
            for(String v: sv.get(s)){
                for(String o: vo.get(v)){
                    cml+= newSentence(s,v,o);
                    cml+="\n";
                }
            }
        }

      return cml;
    }
    public static void main(String[] args) throws IOException {

        write("file9.txt");
    }

    private static String newSentence(String s, String v, String o) {
        String cumle="";
        cumle = String.format("%s %s %s", s,v,o);
        return cumle;
    }


}
