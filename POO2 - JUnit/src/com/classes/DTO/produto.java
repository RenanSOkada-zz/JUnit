package com.classes.DTO;

public class produto {
	
	private String id;
	private String tipo;
	private boolean au;
	private boolean nn;
	
	public produto(){
	}
	
	public produto(String id, String tipo, boolean au, boolean nn){
		setAu(au);
		setId(id);
		setNn(nn);
		setTipo(tipo);
	}
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public boolean isAu() {
		return au;
	}
	public boolean isNn() {
		return nn;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setAu(boolean au) {
		this.au = au;
	}
	public void setNn(boolean nn) {
		this.nn = nn;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("produto [id=");
		builder.append(id);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", au=");
		builder.append(au);
		builder.append(", nn=");
		builder.append(nn);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
