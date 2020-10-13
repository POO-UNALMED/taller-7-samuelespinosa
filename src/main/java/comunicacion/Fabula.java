package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*this.getPaginas();
	}

	@Override
	String interpretacion() {
		String retorno=this.getOrigen()+"\n"+
				   this.getTitulo()+"\n"+
				   this.getAutor()+"\n"+
				   this.getPaginas();
		return retorno;
	}

	@Override
	public String toString() {
		String retorno=this.getOrigen()+"\n"+
				   this.getTitulo()+"\n"+
				   this.getAutor()+"\n"+
				   this.getPaginas()+"\n"+
				   this.ensenanza;
		return retorno;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
