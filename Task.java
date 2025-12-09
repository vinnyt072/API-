package com.Demo.Springboot;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({ "id", "description", "completed" })
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Changed from int to Long

    private String description;
    private boolean completed;

    public Task(int id, String description){
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    // Remove manual getters/setters since @Data generates them
}
