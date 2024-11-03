package com.example.servicioTheBigBangTheory.model.dto;

public class SerieDetalleDTO {

    private String nombre;
    private String creador;
    private Double clasificacion;
    private Double promedioCalificacion;
    private String capituloMejorCalificado;
    private Double calificacionMejorCapitulo;
    private String descripcion;

    public SerieDetalleDTO(String nombre, String creador, Double clasificacion, Double promedioCalificacion, String capituloMejorCalificado, Double calificacionMejorCapitulo, String descripcion) {
        this.nombre = nombre;
        this.creador = creador;
        this.clasificacion = clasificacion;
        this.promedioCalificacion = promedioCalificacion;
        this.capituloMejorCalificado = capituloMejorCalificado;
        this.calificacionMejorCapitulo = calificacionMejorCapitulo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCreador() { return creador; }
    public void setCreador(String creador) { this.creador = creador; }

    public Double getClasificacion() { return clasificacion; }
    public void setClasificacion(Double clasificacion) { this.clasificacion = clasificacion; }

    public Double getPromedioCalificacion() { return promedioCalificacion; }
    public void setPromedioCalificacion(Double promedioCalificacion) { this.promedioCalificacion = promedioCalificacion; }

    public String getCapituloMejorCalificado() { return capituloMejorCalificado; }
    public void setCapituloMejorCalificado(String capituloMejorCalificado) { this.capituloMejorCalificado = capituloMejorCalificado; }

    public Double getCalificacionMejorCapitulo() { return calificacionMejorCapitulo; }
    public void setCalificacionMejorCapitulo(Double calificacionMejorCapitulo) { this.calificacionMejorCapitulo = calificacionMejorCapitulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
