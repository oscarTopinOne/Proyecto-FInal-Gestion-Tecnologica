package health;

import com.github.strengthened.prometheus.healthchecks.HealthChecksCollector;
import org.apache.commons.io.FilenameUtils;


public class Application {
    private static InicioSesion inicioSesion;
    public static void main(String[] args) throws Exception {
        HealthChecksCollector healthchecksMetrics = HealthChecksCollector.Builder.of().setGaugeMetricName("health_check").build();
        healthchecksMetrics.addHealthCheck("database", new DbHealthCheck());
        inicioSesion = new InicioSesion();        
        cambiarNombre();
        healthchecksMetrics.addHealthCheck("inicioSesion", inicioSesion);
        new HealthCheckExporter(healthchecksMetrics).export();
    }
    
	public static boolean validarCliente() {
		int id = 1;
		String pass = "asdf1234";		
		FileUtil futil = null;
		InicioSesion log = null;

		try {
			//ojbeto de prueba null pointer
			futil = new FileUtil();
            inicioSesion.setfUtil(futil);
			return inicioSesion.validarUsrPass(pass, id);
		} catch (Exception e) {
			System.err.println("Error en el componente: Main.\n"
					+ "-Main.java\n"
					+ "--validarCliente(...)\n");
			return false;
		}
	}
	
	public static void cambiarNombre() {
		Cliente objCliente = null;		
			try {
				//ojbeto de prueba null pointer
				objCliente = new Cliente();
				if (validarCliente() == true) {					
					objCliente.getNombre();
				}else {					
					objCliente.getNombre();
				}
			} catch (Exception e) {
				System.err.println("Error en el componente: Main.\n"
						+ "-Main.java\n"
						+ "--cambiarNombre(...)\n");
				e.printStackTrace();
			}		
	}
}

