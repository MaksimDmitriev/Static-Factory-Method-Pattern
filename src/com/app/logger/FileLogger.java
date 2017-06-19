package com.app.logger;

import com.sun.istack.internal.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class FileLogger implements Logger {

    static final String LOG_FILE_NAME = "out" + File.separator + "test_log.txt";

    private final String mFileName;
    private Writer mFileWriter;

    FileLogger(@NotNull String fileName) {
        mFileName = fileName;
        try {
            mFileWriter = new FileWriter(mFileName, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(String message) {
        try {
            mFileWriter.write(message + System.lineSeparator());
            mFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
