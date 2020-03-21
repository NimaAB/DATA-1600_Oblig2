package oppgave4;

import javafx.concurrent.Task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterThread extends Task<Void> {
    private final File filePath;
    private final String text;

    public WriterThread(String text, File filePath){
        this.text = text;
        this.filePath = filePath;
    }
    private void save(String text, File filePath){
        FileWriter writerParamTo_fWriter;
        BufferedWriter fileWriter = null;
        int numberOfLines = 1;
        try{
            writerParamTo_fWriter = new FileWriter(filePath);
            fileWriter = new BufferedWriter(writerParamTo_fWriter);
            for(int i=numberOfLines; i> 0;i--){
                fileWriter.write(text);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        try{
            //assert skal sjekke om filen ikke er null for den lukes.
            assert fileWriter != null;
            //filen lukes at det er skrevet
            fileWriter.close();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    @Override
    public Void call() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.getStackTrace();
        }
        save(text, filePath);
        return null;
    }
}
