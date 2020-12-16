package com.interfaces;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Getter
@Setter
@NoArgsConstructor(force = true)
public abstract class Element implements Visitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}