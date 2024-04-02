package controladores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		//PARA CREAR LA RUTA DEL FICHERO
		LocalDate fechaHoy = LocalDate.now();
		String nombreRuta = "log-" + fechaHoy + "txt";
		File rutaFichero = new File("C:/Users/csi23-mserina/Desktop/" + nombreRuta + ".txt");
		
		FileOutputStream salida = null;
		
		
		
		MenuInterfaz mi = new MenuImplementacion();

        int opcionPrincipal;
        boolean cerrarPrincipal = false;

        do
        {
            System.out.println("MENÚ INICIAL");
            opcionPrincipal = mi.mostrarMenuPrincipalYSeleccion();
            try {
    			
    			salida = new FileOutputStream(rutaFichero, true);
    			
            switch (opcionPrincipal){

                case 0:
                	
                	String texto = "Cliente cierra la aplicacion \n";
                	salida.write(texto.getBytes());
                    salida.close();
                	System.out.println("Se cierra la aplicación \n");
                    cerrarPrincipal = true;
                    break;
                case 1:
                	
                	String texto2 = "Cliente accede a version empleado \n";
                	salida.write(texto2.getBytes());
                   
                	System.out.println("VERSIÓN EMPLEADO");
                    mi.accederVersionEmpleado(salida);
                    
                    break;
                case 2:
                	
                	String texto3 = "Cliente accede a version cliente \n";
                	salida.write(texto3.getBytes());
                    
                	System.out.println("VERSIÓN CLIENTE");
                    mi.accederVersionCliente(salida);                        
                    break;
                default:
                    
                	System.out.println("No se ha elegido una opción aceptable \n");
                    break;
            }
            
            }catch(Exception e){
    			e.getMessage();
    		}

        } while (!cerrarPrincipal);

	}

}
