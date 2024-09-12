package com.example.ticketmanagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Ticket {
    private Long id;

    @NotBlank(message = "Description is mandatory")
    @Size(min = 5, max = 1000, message = "Description must be between 5 and 1000 characters")
    private String description;

    @NotBlank(message = "Status is mandatory")
    private String status;

    public Ticket(Long id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
