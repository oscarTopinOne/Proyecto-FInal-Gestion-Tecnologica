package health;

import com.github.strengthened.prometheus.healthchecks.HealthCheck;
import com.github.strengthened.prometheus.healthchecks.HealthStatus;

import org.apache.commons.io.FilenameUtils;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Logger;

public class InicioSesion extends HealthCheck{
	
	/*VARIABLES*/	
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private Vector clientes;
    private String[] elementosCliente = new String [2];   
    private ArrayList<Cliente> clientesActivos;
    private Cliente objCliente;
    private FileUtil futil;
    private String userPass;
    private int userId;

    @Override
    public HealthStatus check() {
        return validarUsrPass(userPass, userId) ? HealthStatus.HEALTHY : HealthStatus.UNHEALTHY;
    }

    /*CONSTRUCTOR*/
	public InicioSesion() {
		futil = new FileUtil();
		clientesActivos = new ArrayList<>();
		try {							
			clientes = futil.fileToVector("clientes.txt");
			String auxS = "";
			for (int i = 0; i < clientes.size(); i++) {				
				auxS = (String)clientes.elementAt(i);  											
			    elementosCliente = auxS.split(";");
			    objCliente = new Cliente();
			    objCliente.setId(Integer.parseInt(elementosCliente[0]));            
			    objCliente.setPassword(elementosCliente[1]);				    
			    clientesActivos.add(objCliente);				    
			}
		} catch (Exception e) {						
			System.err.println("Error en el componente FileUtil que permite leer la BD de clientes:\n"
					+ "-InicioSesion.java\n"
					+ "--InicioSesion(...)");
			e.printStackTrace();
		}		
	}
	
	/*METODOS*/
    public void setfUtil(FileUtil futil){
        this.futil = futil;    
    }    
    public boolean validarUsrPass(String userPass, int userId) {	
        this.userPass = userPass;
        this.userId = userId;				
		boolean validacion = false;		
		for (int i = 0; i < clientesActivos.size(); i++) {
			objCliente = clientesActivos.get(i);			
			if(objCliente.getId() == userId) {				
				if(userPass.equals(objCliente.getPassword())) {
					validacion = true;
				}
			}
		}		
        if(validacion)           
            logger.info("Login exitoso!");
        else
            logger.info("Fallo al iniciar sesion");
		return validacion;
	}
}
