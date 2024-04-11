package com.devbc.jpa.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable //This will tell JpA this is an embedded entity
public class OrderId implements Serializable {
    private String username;
    private LocalDateTime orderDate;
}
