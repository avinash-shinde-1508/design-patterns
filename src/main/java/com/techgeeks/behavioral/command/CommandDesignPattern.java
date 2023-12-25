package com.techgeeks.behavioral.command;

// client class
public class CommandDesignPattern {
    public static void main(String[] args) {

        // get the executor
        TextFileOpsExecutor executor = new TextFileOpsExecutor();

        // get the commands
        TextFileOperation openFile = new OpenTextFile(new TextFile());
        TextFileOperation saveFile = new SaveTextFile(new TextFile());

        // execute the commands
        System.out.println(executor.executeOps(openFile));
        System.out.println(executor.executeOps(saveFile));
    }
}
