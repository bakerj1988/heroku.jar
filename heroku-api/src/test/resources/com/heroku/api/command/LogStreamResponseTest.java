package com.heroku.api.command;

import com.heroku.api.TestConfig;
import com.heroku.api.command.log.LogStreamResponse;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class LogStreamResponseTest {

    @Test
    public void testLogStream() throws IOException {
        LogStreamResponse response = new LogStreamResponse(new URL(TestConfig.ENDPOINT.getRequiredConfig()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.openStream()));
        String line = "";
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }

    }
}