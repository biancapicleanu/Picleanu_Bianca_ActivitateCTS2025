package ro.cts.seminar11.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

	private List<PachetTuristic> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<PachetTuristic>();
	}
	
	public void adaugaPachet(PachetTuristic pachet) {
		pacheteTuristice.add(pachet);
	}
	
	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(PachetTuristic pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}
		
		return suma;
	}
}
