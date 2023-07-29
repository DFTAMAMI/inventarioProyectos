package ec.edu.espe.inventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VA_FUNCIONARIO")
public class Funcionario {

    @Id
    @Column(name = "CODIGO")
    private int codigo;
    @Column(name = "CODIGO_EMPRESA")
    private int codigoEmpresa;
    @Column(name = "LOCALIDAD")
    private int localidad;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "IDENTIFICACION")
    private String identificacion;

    public Funcionario() {
    }

    public Funcionario(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", codigoEmpresa=" + codigoEmpresa + ", localidad=" + localidad
                + ", nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }

}
