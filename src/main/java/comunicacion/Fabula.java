package comunicacion;

public class Fabula extends Escrito {
	private String enseñanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza=enseñanza;
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
				   this.enseñanza;
		return retorno;
	}

	public String getEnseñanza() {
		return enseñanza;
	}

	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
