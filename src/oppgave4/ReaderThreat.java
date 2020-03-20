package oppgave4;

import javafx.concurrent.Task;


import java.io.*;


public class ReaderThreat extends Task<String> {

    private File filePath;

    public ReaderThreat(File path){
        this.filePath = path;
    }

    private String reader(File path) throws IOException {
        String htmlText = "";
        FileReader fileReaderObj = new FileReader(path);
        try(BufferedReader bf = new BufferedReader(fileReaderObj)){
            while(bf.readLine() != null)
            htmlText = bf.readLine();
        }
        return htmlText;
    }
    @Override
    public String call() throws IOException {
        return reader(filePath);
    }
}
