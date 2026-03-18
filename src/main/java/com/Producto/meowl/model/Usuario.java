package com.Producto.meowl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        @Column(nullable = false)
        String nombre;
        
        @Column(nullable = false, unique = true)
        String email;
        
        @Column(nullable = false)
        String password;
}
