package servicios;

import java.util.List;

import dtos.ClienteDto;

public interface ClienteInterfaz {
	
    public void registroNuevoCliente(List<ClienteDto> listaClientes);

    public void accesoCliente(List<ClienteDto> listaClientes);

}
