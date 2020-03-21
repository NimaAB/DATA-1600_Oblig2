package oppgave4;

import javafx.concurrent.Task;


import java.io.*;


public class ReaderThreat extends Task<String> {

    private File filePath;

    public ReaderThreat(File path){
        this.filePath = path;
    }

    public String reader(File path) throws IOException {
        StringBuilder htmlText = new StringBuilder();
        FileReader fileReaderObj = new FileReader(path);
        try(BufferedReader bf = new BufferedReader(fileReaderObj)){
            htmlText.append(bf.readLine());
        }
        return htmlText.toString();
    }
    @Override
    public String call() throws IOException {
        return reader(filePath);
    }
}
