package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz {
	Scanner sc = new Scanner(System.in);
	@Override
	public void registroNuevoCliente(List<ClienteDto> listaClientes) {
		
        System.out.println("REGISTRO DE NUEVO CLIENTE");
        long id = calcularNuevoId(listaClientes);
        System.out.println("Indique el nombre completo separado por espacios");
        String nombreConEspacios = sc.nextLine(); //NextLine no puede tener arriba un next
        System.out.println("Indique el dni: ");
        String dni = sc.next();	
		System.out.println("Indique el email: "); 
		String email = sc.next();
		System.out.println("Indique la contraseña: "); String contrasenia =
		sc.next();
		 

        ClienteDto nuevoCliente = new ClienteDto(id, dni, nombreConEspacios, email, contrasenia);
        listaClientes.add(nuevoCliente);

	}
	
    private long calcularNuevoId(List<ClienteDto> listaClientes)
    {
        long idCalculado;
        int tamanioLista = listaClientes.size();
        if (tamanioLista == 0)
        {
            idCalculado = 1;
        }
        else
        {
            idCalculado = listaClientes.get(tamanioLista-1).getIdCliente() + 1;
        }

        return idCalculado;
    }

	@Override
	public void accesoCliente(List<ClienteDto> listaClientes) {
		System.out.println("ACCESO CLIENTE (LOGIN)");
        System.out.println("Email: ");
        String emailAcceso = sc.next();
        System.out.println("Contraseña: ");
        String contraseniaAcceso = sc.next();

        for(ClienteDto cliente : listaClientes)
        {
            if (cliente.getEmailCliente().equals(emailAcceso) & 
                cliente.getContraseniaCliente().equals(contraseniaAcceso) &
                cliente.isEsValidado() == true) {

                System.out.println("INICIO DE SESIÓN CORRECTO");

            }
            else
            {

                System.out.println("ERROR EN INICIO DE SESIÓN");

            }
        }

	}

}
