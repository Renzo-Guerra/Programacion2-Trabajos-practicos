package TP_4.consigna6;

/*
 * NOTA:
 * No implementé un toString para cada tipo de empleado ya que solo me pide mostrar 
 * cargo, nombre, apellido y edad. No dice nada sobre mostrar los otros atributos que posea.
*/

public class Main {
  public static void main(String[] args) {
    // Creamos los "asociados"
    Empleado empleado1 = new Empleado("Miguel", "Alvarez", 34, 12345, 60000);
    Empleado empleado2 = new Empleado("Franco", "Piñeda", 44, 122212, 55000);
    Empleado empleado3 = new Empleado("Valentin", "Orellano", 22, 888778874, 67000);
    Empleado empleado4 = new Empleado("Francisco", "Aguilar", 26, 773634, 63000);
    UsuarioFinal usuario1 = new UsuarioFinal("Luca", "Martinez", 22, "ElLukita", "contraseña12345"); //Para nada es mi contraseña en algo...
    UsuarioFinal usuario2 = new UsuarioFinal("Esteban", "Torres", 30, "eltorreta", "asflakjk13_34?--");
    Jerarquico jerarquico1 = new Jerarquico("Guillermo", "Deltoro", 40, 334323, 90000);
    Jerarquico jerarquico2 = new Jerarquico("Agustin", "Palacios", 21, 112321, 95000);

    // Le asignamos empleados al jerarquico1
    jerarquico1.agregarEmpleadoACargo(empleado1);
    jerarquico1.agregarEmpleadoACargo(empleado3);
    // Le asignamos empleados al jerarquico2
    jerarquico2.agregarEmpleadoACargo(empleado2);
    jerarquico2.agregarEmpleadoACargo(empleado4);

    // Instanciamos la empresa y le agregamos los empleados
    Empresa empresa = new Empresa();
    empresa.agregarAsociado(empleado1);
    empresa.agregarAsociado(empleado2);
    empresa.agregarAsociado(empleado3);
    empresa.agregarAsociado(empleado4);
    empresa.agregarAsociado(usuario1);
    empresa.agregarAsociado(usuario2);
    empresa.agregarAsociado(jerarquico1);
    empresa.agregarAsociado(jerarquico2);

    // Debido a que el metodo devuelve una String, debemos imprimirlo dentro de un System.out.print/ln()
    System.out.print(empresa.obtenerAsociadosEnCadena());

    // Mostrando empleados a cargo
    System.out.println("\nMostrando los empleados a cargo de un jerarquico: ");
    jerarquico1.verEmpleadosACargo();
  }
}
