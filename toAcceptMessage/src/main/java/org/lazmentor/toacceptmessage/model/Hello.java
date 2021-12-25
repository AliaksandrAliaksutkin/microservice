package org.lazmentor.toacceptmessage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hello")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Hello {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "message")
    private String message;

    public Hello(String message) {
        this.message = message;
    }
}