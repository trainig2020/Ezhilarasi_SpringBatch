package com.ezhil.config;

import org.springframework.batch.item.file.LineMapper;

public class PassThroughLineMapper implements LineMapper<String>{

    @Override
    public String mapLine(String line, int lineNumber) throws Exception {
        return line;
    }

}