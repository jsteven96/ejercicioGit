import java.text.SimpleDateFormat;
import java.util.Date;

public class HolaAlianza {

	public static void main(String[] args) {
		Date ahora = new Date();
    	SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
    	System.out.println("Hola a las: "+formateador.format(ahora));
	}

}
