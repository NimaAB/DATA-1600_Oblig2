package oppgave4;

import javafx.concurrent.Task;
import javafx.scene.web.HTMLEditor;

import java.io.*;

public class ReaderThread extends Task<Void> {

    private File filePath;
    private HTMLEditor htmlEditor;

    public ReaderThread(File path, HTMLEditor editor){
        this.filePath = path;
        this.htmlEditor = editor;
    }

    public void reader(File path, HTMLEditor editor) throws IOException {
        StringBuilder htmlText = new StringBuilder();
        FileReader fileReaderObj = new FileReader(path);
        try(BufferedReader bf = new BufferedReader(fileReaderObj)){
            htmlText.append(bf.readLine());
        }
        editor.setHtmlText(htmlText.toString());
    }
    @Override
    protected Void call(){
        try{
            Thread.sleep(3000);
            reader(filePath,htmlEditor);
        }catch (InterruptedException | IOException e){
            e.getMessage();
        }
        return null;
    }
}
