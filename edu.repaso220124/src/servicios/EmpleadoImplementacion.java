package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public void validarCliente(List<ClienteDto> listaClientes) {
		System.out.println("CLIENTES NO VALIDADOS");
        List<ClienteDto> listaAuxiliar = new ArrayList<ClienteDto>();

        for (ClienteDto cliente : listaClientes)
        {
            if (cliente.isEsValidado() == false)
            {
                System.out.println("\\\\\\\\\\\\\\\\\\\\");
                System.out.println("DNI: " + cliente.getDniCliente());
                System.out.println("NOMBRE: " + cliente.getNombreCompletoCliente());
                System.out.println("\\\\\\\\\\\\\\\\\\\\");
                listaAuxiliar.add(cliente);
            }

        }

        if (listaAuxiliar.size() > 0)
        {
            System.out.println("Indica el dni del cliente a validar: ");
            String dniClienteAValidar = sc.next();
            for (ClienteDto cliente : listaClientes)
            {
                if (cliente.getDniCliente().equals(dniClienteAValidar))
                {
                    cliente.setEsValidado(true);
                    System.out.println("El cliente con dni " + dniClienteAValidar + " ha sido validado");
                }
            }
        }

	}

	@Override
	public void borrarCliente(List<ClienteDto> listaClientes) {
		
		System.out.println("BORRAR CLIENTE");
        if (listaClientes.size() > 0)
        {
            System.out.println("Indica el dni del cliente a borrar: ");
            String dniClienteABorrar = sc.next();
            ClienteDto clienteAuxiliar = new ClienteDto();
            for (ClienteDto cliente : listaClientes)
            {
                if (cliente.getDniCliente().equals(dniClienteABorrar))
                {
                    clienteAuxiliar = cliente;
                }
            }

            listaClientes.remove(clienteAuxiliar);
            System.out.println("El cliente con dni " + dniClienteABorrar + " ha sido borrado");

        }

	}

	@Override
	public void mostrarClientes(List<ClienteDto> listaClientes) {
		
        System.out.println("MOSTRAR CLIENTES");
        for (ClienteDto cliente : listaClientes)
        {
            System.out.println("%%%%%%%%%%");
            System.out.println("DNI: " + cliente.getDniCliente());
            System.out.println("NOMBRE: " + cliente.getApellido1Cliente() + " " +
                cliente.getApellido2Cliente() + ", " + cliente.getNombreCliente());
            String sn;
            if (cliente.isEsValidado() == true)
            {
                sn = "si";
            }
            else
            {
                sn = "no";
            }
            System.out.println("ESTADO VALIDACIÓN: " + sn);
            System.out.println("%%%%%%%%%%");

        }
	
	}

}
