
package com.seminario.edificios.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "edificios")
public class Edificio implements Serializable {
    
    @Id
    @Column(name = "id_edificio")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer idEdificio;
    
    @Column(name = "clave")
    private String clave; 
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "metros_cuadrados")
    private Integer metrosCuadrados; 
    
    @Column(name = "altura")
    private Double altura; 
    
    @Column(name = "num_pisos")
    private Integer numeroPisos; 
    
    @Column(name = "num_apartamentos")
    private Integer numeroApartamentos; 
    
    @Column(name = "num_oficinas")
    private Integer numeroOficinas; 
    
    @Column(name="nom_parqueadero")
    private String nombreParqueadero; 
    
    @Column(name = "num_pisinas")
    private Integer numeroPiscinas; 
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "departamento")
    private String departamento; 
    
    @Column(name = "ciudad")
    private String ciudad; 
    
    
    @Column(name = "tiene_asensor")
    private Boolean tieneAsensor; 
    
    @Column(name = "valor_administracion")
    private Double valorAdministracion; 
    
    @Column(name = "tienzona_social")
    private Boolean tieneZonaSocial; 
    
    public Edificio()
    {
        
    }

    public Edificio(Integer idEdificio, String clave, String nombre, Integer metrosCuadrados,
            Double altura, Integer numeroPisos, Integer numeroApartamentos, Integer numeroOficinas,
            String nombreParqueadero, Integer numeroPiscinas, String pais, String departamento,
            String ciudad, Boolean tieneAsensor, Double valorAdministracion, Boolean tieneZonaSocial) {
        this.idEdificio = idEdificio;
        this.clave = clave;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.altura = altura;
        this.numeroPisos = numeroPisos;
        this.numeroApartamentos = numeroApartamentos;
        this.numeroOficinas = numeroOficinas;
        this.nombreParqueadero = nombreParqueadero;
        this.numeroPiscinas = numeroPiscinas;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.tieneAsensor = tieneAsensor;
        this.valorAdministracion = valorAdministracion;
        this.tieneZonaSocial = tieneZonaSocial;
    }

    public Integer getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(Integer idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public Integer getNumeroApartamentos() {
        return numeroApartamentos;
    }

    public void setNumeroApartamentos(Integer numeroApartamentos) {
        this.numeroApartamentos = numeroApartamentos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }

    public Integer getNumeroPiscinas() {
        return numeroPiscinas;
    }

    public void setNumeroPiscinas(Integer numeroPiscinas) {
        this.numeroPiscinas = numeroPiscinas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getTieneAsensor() {
        return tieneAsensor;
    }

    public void setTieneAsensor(Boolean tieneAsensor) {
        this.tieneAsensor = tieneAsensor;
    }

    public Double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(Double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public Boolean getTieneZonaSocial() {
        return tieneZonaSocial;
    }

    public void setTieneZonaSocial(Boolean tieneZonaSocial) {
        this.tieneZonaSocial = tieneZonaSocial;
    }
    
    
    
    
    
    
    
    
    
    
}
