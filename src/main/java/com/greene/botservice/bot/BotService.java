package com.greene.botservice.bot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BotService {
    private final BotRepository repository;

    public List<Bot> findAllBots() {
        return repository.findAll();
    }

    public Bot findById(long id) {
        return repository.findById(id).orElseThrow(BotNotFoundException::new);
    }

    public Bot saveBot(Bot bot) {
        bot.setCreatedOn(Instant.now());
        bot.setActive(true);
        return repository.save(bot);
    }

    public void deleteBotById(long id) {
        repository.deleteById(id);
    }
}
