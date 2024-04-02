package dtos;

public class ClienteDto {
	
	long idCliente;
    String dniCliente = "aaaaa";
    String nombreCliente = "aaaaa";
    String apellido1Cliente = "aaaaa";
    String apellido2Cliente = "aaaaa";
    String nombreCompletoCliente = "aaaaa";
    String emailCliente = "aaaaa";
    String contraseniaCliente = "aaaaa";
    boolean esValidado = false;

    public ClienteDto(long idCliente, String dniCliente, String nombreCompletoCliente, String emailCliente, String contraseniaCliente)
    {
        this.dniCliente = dniCliente;
        this.nombreCompletoCliente = nombreCompletoCliente;
        this.emailCliente = emailCliente;
        this.contraseniaCliente = contraseniaCliente;
        this.idCliente = idCliente;
        String[] arrayNombre = nombreCompletoCliente.split(" ");
        this.nombreCliente = arrayNombre[0];
        this.apellido1Cliente = arrayNombre[1];
        this.apellido2Cliente = arrayNombre[2];
    }

    public ClienteDto()
    {
    }

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellido1Cliente() {
		return apellido1Cliente;
	}

	public void setApellido1Cliente(String apellido1Cliente) {
		this.apellido1Cliente = apellido1Cliente;
	}

	public String getApellido2Cliente() {
		return apellido2Cliente;
	}

	public void setApellido2Cliente(String apellido2Cliente) {
		this.apellido2Cliente = apellido2Cliente;
	}

	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}

	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getContraseniaCliente() {
		return contraseniaCliente;
	}

	public void setContraseniaCliente(String contraseniaCliente) {
		this.contraseniaCliente = contraseniaCliente;
	}

	public boolean isEsValidado() {
		return esValidado;
	}

	public void setEsValidado(boolean esValidado) {
		this.esValidado = esValidado;
	}
    
    

}
