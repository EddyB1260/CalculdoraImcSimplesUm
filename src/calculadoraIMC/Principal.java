package calculadoraIMC;

public class Principal {

	public static void main(String[] args) {
	
		Paciente paciente1 = new Paciente(39, 1.54);
		Paciente paciente2 = new Paciente (110, 1.94);
		Paciente paciente3 = new Paciente (75, 1.75);
		
		System.out.println("IMC =" + paciente1.calcularImc() + "Diagnóstico: " + paciente1.diagnostico() );
		System.out.println("IMC =" + paciente2.calcularImc() + "Diagnóstico: " + paciente2.diagnostico() );
		System.out.println("IMC =" + paciente3.calcularImc() + "Diagnóstico: " + paciente3.diagnostico() );

	
	
	
	
	}
}
