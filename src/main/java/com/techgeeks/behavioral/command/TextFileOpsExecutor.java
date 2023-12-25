package com.techgeeks.behavioral.command;

// Invoker
public class TextFileOpsExecutor {

    public String executeOps(TextFileOperation textFileOperation){
        return textFileOperation.execute();
    }
}
