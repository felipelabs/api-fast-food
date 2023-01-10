package io.github.felipelabs.fastfood.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_SANDUICHE")
public class Sanduiche implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 50, nullable = false)
    private String pao;
    @Column(length = 50, nullable = false)
    private String carne;
    @Column(length = 50, nullable = false)
    private String queijo;
    @Column(length = 50, nullable = false)
    private String molho;
    @Column(length = 100, nullable = false)
    private String acompanhamentos;
}
