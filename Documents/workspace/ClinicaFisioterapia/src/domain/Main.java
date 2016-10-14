package domain;

import java.util.List;

import javax.swing.JOptionPane;

import Entity.Paciente;
import Services.CadastraPaciente;

public class Main {

	static CadastraPaciente cadastraPaciente = new CadastraPaciente();
	public static void main(String[] args) {
			List<Paciente> listaDePaciente = cadastraPaciente.fabricarPaciente();
			for (Paciente paciente : listaDePaciente) {
				JOptionPane.showMessageDialog(null, "Você tem uma consulta com " + paciente.getNome()
				+ "\nCPF: " + paciente.getCpf()
				+ " as " + paciente.getHorarioMarcado() + "\n");
			}
				
			
			
	}

}
