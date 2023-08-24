package modelo;

public class Empresa extends Registro{
    
    private String nombreEmpresa;
    private String ciudad;
    private String paginaWeb;

    public Empresa(String nombre, String apellido, String direccion, String telefono, String nombreEmpresa, String ciudad, String paginaWeb){
        super(nombre, apellido, direccion, telefono);
        this.nombreEmpresa = nombreEmpresa;
        this.ciudad = ciudad;
        this.paginaWeb = paginaWeb;
    }
    
    public String toString() {
        return super.toString() +
        "\n Nombre empresa:" + nombreEmpresa +
        "\n Ciudad:" + ciudad +
        "\n Pagina Web" + paginaWeb;
    }
}
