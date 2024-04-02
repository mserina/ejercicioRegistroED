package servicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	@Override
	public int mostrarMenuPrincipalYSeleccion() {
		int opcion;

        System.out.println("0. Cerrar aplicación");
        System.out.println("1. Versión empleado");
        System.out.println("2. Versión cliente");
        System.out.println("Escriba la opción deseada: ");
        opcion = sc.nextInt();
        return opcion;
	}

	@Override
	public void accederVersionEmpleado(FileOutputStream salida) {

		EmpleadoInterfaz ei = new EmpleadoImplementacion();

        int opcionEmpleado;
        opcionEmpleado = mostrarMenuEmpleadoYSeleccion();

        try {
        	
        	switch (opcionEmpleado)
            {
                case 0:
                	String texto = "Se cierra el menu de empleado \n";
                	salida.write(texto.getBytes());
                    salida.close();
                    break;
                case 1:
                	String texto1 = "Abriendo validador de clientes \n";
                	salida.write(texto1.getBytes());
                    salida.close();
                    
                    ei.validarCliente(listaClientes);
                    break;
                case 2:
                	String texto2 = "Abriendo borrador de clientes \n";
                	salida.write(texto2.getBytes());
                    salida.close();
                	
                	ei.borrarCliente(listaClientes); 
                    break;
                case 3:
                	String texto3 = "Mostrando clientes \n";
                	salida.write(texto3.getBytes());
                    salida.close();
                	
                    ei.mostrarClientes(listaClientes); 
                    break;
                default:
                    System.out.println("No ha seleccionado una opción aceptable vuelve al menú inicial.");
                    break;
            }
        }catch(Exception e) {
        	e.getMessage();
        }
	}
	
    private int mostrarMenuEmpleadoYSeleccion() {
    
    	int opcion;

	    System.out.println("0. Volver");
	    System.out.println("1. Validar cliente");
	    System.out.println("2. Borrar cliente");
	    System.out.println("3. Mostrar clientes");
	    System.out.println("Escriba la opción deseada: ");
	    opcion = sc.nextInt();
	    return opcion;
    
    }

	@Override
	public void accederVersionCliente(FileOutputStream salida) {
		
		ClienteInterfaz ci = new ClienteImplementacion();

        int opcionCliente;
        opcionCliente = mostrarMenuClienteYSeleccion();
        try {
        
        	switch (opcionCliente)
            {
                case 0:
                    break;
                case 1:
                	String texto = "Se ha seleccionado la opcion registr de nuevo cliente \n";
                	salida.write(texto.getBytes());
                    ci.registroNuevoCliente(listaClientes);
                    break;
                case 2:
                	String texto2 = "Se ha seleccionado la opcion acceso de clientes \n";
                	salida.write(texto2.getBytes());
                    ci.accesoCliente(listaClientes); 
                    break;
                default:
                    System.out.println("No ha seleccionado una opción aceptable vuelve al menú inicial.");
                    break;
            }

        }catch(IOException e) {
        	e.getMessage();
        }
	}
	
    private int mostrarMenuClienteYSeleccion()
    {
        int opcion;

        System.out.println("0. Volver");
        System.out.println("1. Registro cliente");
        System.out.println("2. Acceso cliente (login)");
        System.out.println("Escriba la opción deseada: ");
        opcion = sc.nextInt();
        return opcion;
    
    }

}
