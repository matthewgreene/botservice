package com.greene.botservice.bot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BotNotFoundException extends RuntimeException {
    public BotNotFoundException() {
        super("Bot not found");
    }

    public BotNotFoundException(String message) {
        super(message);
    }
}
