package Assignment11;
import java.io.*;

import java.util.HashMap;
import java.util.Scanner;

class takeInputs{

    Scanner sc = new Scanner(System.in);
    String inputFromFile() throws IOException {
        System.out.println("Enter file name");
        String fileName = sc.next();
        System.out.println(fileName);
        File  inputFile=new File(fileName);
        BufferedReader br=new BufferedReader(new FileReader(inputFile));
        String fileContent = "";
        String input="";
        while(((input=br.readLine())!=null)){
            fileContent+=input;
            System.out.println(fileContent);
        }
        return fileContent;
    }

    String outputFileName(){
        System.out.println("Enter output file name");
         return sc.next();
        }
    }



class CountOccurances{
    HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
    public HashMap<Character,Integer> countCharacters(String input){

        char[] characterArray = input.toCharArray();
        for (char c : characterArray) {
            if (!countMap.containsKey(c)) {
                countMap.put(c, 1);
            } else {
                countMap.put(c, countMap.get(c) + 1);
            }
        }
        return  countMap;
    }
}

class WriteToFile{

    public void WriteInFile(HashMap<Character,Integer> charOccurances,String FileName) throws IOException {
        File outputFile=new File(FileName);
        BufferedWriter bw=new BufferedWriter(new FileWriter(outputFile));

        for(Character c: charOccurances.keySet()){
            bw.write(c +" "+ charOccurances.get(c));
            bw.newLine();
            System.out.println(c +" "+ charOccurances.get(c));
        }
        bw.close();
    }

}

public class ReadWriteFile {
        public static void main(String[] args) throws IOException {
            takeInputs ti = new takeInputs();
            String input = ti.inputFromFile();
            CountOccurances c = new CountOccurances();
            HashMap<Character,Integer> CharOccurances = new HashMap();

            CharOccurances = c.countCharacters(input);
            WriteToFile wf= new WriteToFile();
            String outputFile = ti.outputFileName();
            wf.WriteInFile(CharOccurances,outputFile);
        }
}
