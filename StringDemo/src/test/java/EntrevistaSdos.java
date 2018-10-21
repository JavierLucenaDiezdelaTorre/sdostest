import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EntrevistaSdos {
	
public MainTests sdostest;

//Menu
public String Servicios="";
public String Productos ="";
public String Proyectos= "";
public String Contacto= "";
public String Equipo= "";
public String Blog= "";
public String Buscador="";
public String Login="";
public String SalirLogin="";
public String Inicio="";

//URL 
public String ServiciosUrl="";
public String ProductosUrl="";
public String ProyectosUrl="";
public String EquipoUrl="";
public String ContactoUrl="";
public String BlogUrl="";
public String InicioUrl="";


//private Object url_equipo;
	
	public EntrevistaSdos(){
		sdostest = new MainTests();
	}

	@Before
	public void valores()
	{
		//Menu
		Servicios = "//ul[@id='menu']//a[text()='Servicios']";
		Productos = "//ul[@id='menu']//a[text()='Productos']";
		Proyectos = "//ul[@id='menu']//a[text()='Proyectos']";
		Equipo = "//ul[@id='menu']//a[text()='Equipo']";
		Contacto ="//ul[@id='menu']//a[text()='Contacto']";
		Blog = "//ul[@id='menu']//a[text()='Blog']";
		Login ="//i[@id='slw-login']";
		Buscador="//i[@class='search-button icon-search font-icon']";
		SalirLogin="//span[@class='slw-close']";
		Inicio=" //a[@href='https://sdos.es']";
		
		//URL
		InicioUrl="https://sdos.es/";
		ServiciosUrl="https://sdos.es/servicios/";
		ProductosUrl="https://sdos.es/productos/";
		ProyectosUrl="https://sdos.es/proyectos/";
		EquipoUrl="https://sdos.es/equipo/";
		ContactoUrl="https://sdos.es/contacto/";
		BlogUrl="https://sdos.es/blog/";
	}
	
	@Test
	public void test1() {
		
		sdostest.AbrirSdos();
		sdostest.Comprobar(InicioUrl);
		sdostest.Secciones(Servicios);
		sdostest.Comprobar(ServiciosUrl);
		sdostest.Secciones(Productos);
		sdostest.Comprobar(ProductosUrl);
		sdostest.Secciones(Proyectos);
		sdostest.Comprobar(ProyectosUrl);
		sdostest.Secciones(Equipo);
		sdostest.Comprobar(EquipoUrl);
		sdostest.Secciones(Contacto);
		sdostest.Comprobar(ContactoUrl);
		sdostest.Secciones(Blog);
		sdostest.Comprobar(BlogUrl);
		sdostest.Secciones(Buscador);
		sdostest.Secciones(Inicio);
		sdostest.Comprobar(InicioUrl);
		sdostest.Secciones(Login);
		sdostest.CerrarLogin(SalirLogin);
		sdostest.CerrarNavegador();
		

	}

}
