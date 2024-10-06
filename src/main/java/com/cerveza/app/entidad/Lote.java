package com.cerveza.app.entidad;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lote")
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cerveza", nullable = false)
    private String cerveza;

    @Column(name = "cantidad_litros", nullable = false)
    private Integer cantidadLitros;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "notas")
    private String notas;

    @Column(name = "fecha_carga", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCarga;

    @Column(name = "fecha_vencimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimiento;

    @Column(name = "fecha_carga_madurador", nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCargaMadurador;

    // Constructores
    public Lote() {}

    public Lote(String cerveza, Integer cantidadLitros, String estado, String notas, Date fechaCarga, Date fechaVencimiento, Date fechaCargaMadurador) {
        this.cerveza = cerveza;
        this.cantidadLitros = cantidadLitros;
        this.estado = estado;
        this.notas = notas;
        this.fechaCarga = fechaCarga;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaCargaMadurador = fechaCargaMadurador;
    }

    // Getters y Setters correctos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCerveza() {
        return cerveza;
    }

    public void setCerveza(String cerveza) {
        this.cerveza = cerveza;
    }

    public Integer getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(Integer cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaCargaMadurador() {
        return fechaCargaMadurador;
    }

    public void setFechaCargaMadurador(Date fechaCargaMadurador) {
        this.fechaCargaMadurador = fechaCargaMadurador;
    }
}
