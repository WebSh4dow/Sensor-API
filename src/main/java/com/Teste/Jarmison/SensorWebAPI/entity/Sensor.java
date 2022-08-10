package com.Teste.Jarmison.SensorWebAPI.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@Table(name = "sensor_tbl")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_ponto",nullable = false)
    private String nomePonto;
    @Column(name = "temperatura",nullable = false)
    private double temperatura;
    @Column(name = "dead_line",nullable = false)
    private LocalDateTime deadLine;
    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private Date dataRealizacao;
    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;
}
