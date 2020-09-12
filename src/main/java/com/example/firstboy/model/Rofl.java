package com.example.firstboy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "rofl")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Rofl {
    
    @Id
    @Column
    private int id;

    @Column(name = "rofl")
    private String laugh;


}
