package Enum;

public enum tipos {
	INT(1) ,
	FLOAT(2),
	VARCHAR(3),
	DATE(4),
	BOOLEAN(5);
	
	private final int valor; 

	tipos(int tiposValor) {
		valor = tiposValor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void tiposEnum() {
		
	}
	
}
