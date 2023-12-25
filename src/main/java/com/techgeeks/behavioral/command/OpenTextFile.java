package com.techgeeks.behavioral.command;

// Concrete command implementation
public class OpenTextFile implements TextFileOperation{

    private TextFile textFile;

    public OpenTextFile(TextFile textFile){
        this.textFile = textFile;
    }
    @Override
    public String execute() {
      return textFile.open();
    }
}
