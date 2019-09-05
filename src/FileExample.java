import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample {
    public static void main (String[] args)throws IOException{
        //part 1 reading into the list
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] name_list = all_names.split("\n");
        //part2 - printing the list
        for (String name: name_list){
            System.out.println(name);
        }
    }
}
