package pizzariaAbstract;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {

		String inputData = JOptionPane.showInputDialog(null, "Informe uma data no formato dd/mm/yyyy");

		if (inputData.length() < 10) {
			System.out.println("Use: java Main dd/mm/yyyy");
			System.exit(1);
		}

		Date data = null;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data = df.parse(inputData);
		} catch (ParseException e) {
			System.out.println("A data deve estar no formato dd/mm/yyyy");
			System.exit(1);
		}

		Cliente consumidor = new Cliente(data);
		consumidor.pedirPizza();
	}
}
