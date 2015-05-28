package fullApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractBuilder implements IBuilder {

    protected static final String root_dir = "bin/textFiles/";
    protected StringBuilder result = new StringBuilder();

    protected static StringBuilder getFileContent(String file_path)
    {
        StringBuilder contents = new StringBuilder();

        try {
            BufferedReader input =  new BufferedReader(new FileReader(file_path));
            try {
                String line = null;
                while (( line = input.readLine()) != null){
                    contents.append(line);
                    contents.append(System.getProperty("line.separator"));
                }
            }
            finally {
                input.close();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        return contents;
    }
    protected static String buildPath(String tipo, String parte){
        return root_dir  + tipo.toLowerCase() + "/" + parte + ".txt";
    }


}
