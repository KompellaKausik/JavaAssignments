package Assignment1;


import java.io.File;
import java.util.*;


class takeInputs{
    private Scanner sc = new Scanner(System.in);
    public String inputPattern(){
        System.out.println("enter file pattern to search");
        return sc.next();
    }

}

class FileSearch{
    private List<String> FileNames = new ArrayList<>();
    private void SearchForFiles(String pattern, File rootDirectory){

        if(rootDirectory.isDirectory() && rootDirectory!=null){  // checking if the given directory is valid or not

            File[] FilesinDirectory = rootDirectory.listFiles();  //listing all the files in the directory
            if(FilesinDirectory!=null) {                            // checking if the directory is not null
                for (File fileIterator : FilesinDirectory) {
                    if (fileIterator.isDirectory()) {               // checking for inner directories
                        SearchForFiles(pattern, fileIterator);      //calling the search for files on sub directories
                    } else {
                       // System.out.println(fileIterator.getName());
                        if (fileIterator.getName().matches(pattern)) {
                            FileNames.add(fileIterator.getAbsolutePath());     //if a filename matches the patter adding the
                                                                               // adding the file name to the list
                        }
                    }
                }
            }
        }
    }

    private void printFiles(){
        if(FileNames.size()>0){
            for(String s: FileNames)
                System.out.println(s);
        }
        else
            System.out.println("no Files found");
    }

    void TestSearchForFile(String pattern,File rootDirectory){
        SearchForFiles(pattern,rootDirectory);
        printFiles();
    }


}

public class LookUpForFile {
    public static void main(String[] args){
        File rootDirectory = new File("/home/");  //initializing the root directory
        //String pattern = ".*\\.java$";
        FileSearch fs = new FileSearch();
        takeInputs t = new takeInputs();
        String pattern="";
        while(pattern!="exit"){
            pattern = t.inputPattern();
            if(pattern.equals("exit"))
                break;
            else
            fs.TestSearchForFile(pattern,rootDirectory);  //calling the driver method to execute the task
        }
        System.out.println("exit");
    }
}
