package com.greene.botservice.bot;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/bot")
@RequiredArgsConstructor
public class BotController {
    private final BotService service;

    @GetMapping
    public ResponseEntity getAllBots() {
        return ResponseEntity.ok(service.findAllBots());
    }

    @GetMapping("/{id}")
    public ResponseEntity getBotById(@PathVariable long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity saveBot(@RequestBody Bot bot) {
        Bot savedBot = service.saveBot(bot);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedBot.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
