package comunicacion;

public class Fabula extends Escrito {
	private String ense�anza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas,String ense�anza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ense�anza=ense�anza;
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
				   this.ense�anza;
		return retorno;
	}

	public String getEnse�anza() {
		return ense�anza;
	}

	public void setEnse�anza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
