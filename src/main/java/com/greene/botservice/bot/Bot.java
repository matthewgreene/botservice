package com.greene.botservice.bot;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private BotType botType;
    private Instant createdOn;
    private boolean active;
}
