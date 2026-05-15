public class Persona {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String telefono;
    private int edad;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {

        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNombre(String nombre) {

            this.nombre = nombre;
        }

    public String getNombre() {

        return nombre;
    }

    public void setapellidoPaterno(String apellidoPaterno) {

        this.apellidoPaterno = apellidoPaterno;
    } 

    public String getapellidoPaterno() {

        return apellidoPaterno;
    }

    public void setapellidoMaterno(String apellidoMaterno) {

        this.apellidoMaterno = apellidoMaterno;
    } 

    public String getapellidoMaterno() {

        return apellidoMaterno;
    }

    public void setedad(int edad) {

        this.edad = edad;
    }

    public int getedad() {

        return edad;
    }

    public void setdomicilio(String domicilio) {

        this.domicilio = domicilio;
    }

    public String getdomicilio() {

        return domicilio;
    }

    public void settelefono(String telefono) {

        this.telefono = telefono;
    }

    public String gettelefono() {

        return telefono;
    }

    @Override
    public String toString() {

        return
        "\n\nNombre: " + this.nombre +
        "\nApellido Paterno: " + this.apellidoPaterno + 
        "\nApellido Materno: " + this.apellidoMaterno + 
        "\nEdad: " + this.edad +
        "\nTelefono: " + this.telefono +
        "\nDomicilio: " + this.domicilio;
    }

}
