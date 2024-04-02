package servicios;

import java.io.FileOutputStream;

public interface MenuInterfaz {
	
    public int mostrarMenuPrincipalYSeleccion();

    public void accederVersionEmpleado(FileOutputStream salida);

    public void accederVersionCliente(FileOutputStream salida);
}
