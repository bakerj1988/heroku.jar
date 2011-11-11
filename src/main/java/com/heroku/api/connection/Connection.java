package com.heroku.api.connection;

import com.heroku.api.HerokuAPI;
import com.heroku.api.command.Command;
import com.heroku.api.command.CommandResponse;

import java.net.URL;

/**
 * Connection manager for connecting to the Heroku API.
 *
 * @author Naaman Newbold
 */
public interface Connection<F extends FutureWrapper> {


    <T extends CommandResponse> T executeCommand(Command<T> command);

    <T extends CommandResponse> F executeCommandAsync(Command<T> command);

    URL getEndpoint();

    String getEmail();

    String getApiKey();

    HerokuAPI getApi();
}
