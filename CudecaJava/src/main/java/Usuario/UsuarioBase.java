package Usuario;

public class UsuarioBase implements iUsuario {
    private String nombre;
    private String email;
    private String dni;
    private boolean spam;

    public UsuarioBase(String nombre, String email, String dni) {
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.spam = false;
    }

    public UsuarioBase(String nombre, String email, String dni, boolean spam) {
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.spam = spam;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
