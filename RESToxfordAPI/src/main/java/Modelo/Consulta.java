/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.persistence.*;

@Entity
@Table(name = "consultas")
public class Consulta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Long getId() {
        return id;
    }

    public String getPalabra() {
        return palabra;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    @Column(name = "palabra")
    private String palabra;

    @Column(name = "fecha_consulta")
    private Date fechaConsulta;

    // Aquí irían los getters y setters para cada campo.
}