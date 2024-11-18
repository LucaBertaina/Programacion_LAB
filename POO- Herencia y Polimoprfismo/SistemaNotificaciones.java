import java.util.ArrayList;

abstract class CanalNotificacion {
    String usuario;
    String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public abstract void enviarNotificacion();
}

interface Personalizable {
    void personalizarMensaje(String nuevoMensaje);
}

class CorreoElectronico extends CanalNotificacion implements Personalizable {
    String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo a " + direccionCorreo + " con mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }
}

class MensajeTexto extends CanalNotificacion implements Personalizable {
    String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto a " + numeroTelefono + " con mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }
}

class Notificaciones {
    ArrayList<CanalNotificacion> canales = new ArrayList<>();

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            System.out.println("Canal: " + canal.getClass().getSimpleName() + " - Usuario: " + canal.usuario);
        }
    }
}

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CorreoElectronico correo = new CorreoElectronico("Juan", "Bienvenido a nuestro servicio", "juan@example.com");
        MensajeTexto mensaje = new MensajeTexto("Maria", "Tu pedido ha sido enviado", "123456789");

        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensaje);

        notificaciones.personalizarMensajes("Este es un mensaje personalizado para ti");
        notificaciones.enviarNotificaciones();
        notificaciones.mostrarCanales();
    }
}
