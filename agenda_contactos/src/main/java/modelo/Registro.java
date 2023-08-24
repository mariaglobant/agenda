package modelo;

public class Registro {
    private String nombreCompleto;
    private String apellido;
    private String dirección;
    private String telefono;

    public Registro(String nombreCompleto, String apellido, String dirección, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.apellido = apellido;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getDirección() {
        return dirección;
    }


    public void setDirección(String dirección) {
        this.dirección = dirección;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto +
               "\nApellido: " + apellido +
               "\nDirección: " + dirección +
               "\nTeléfono: " + telefono;
    }
}
