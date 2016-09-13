package com.letfar.criminalintent;

import java.util.UUID;

/**
 * Created by Alex on 13.09.2016.
 */
public class Crime {
    private UUID id;
    private String title;

    public Crime() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() { return id; }

    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }
}
