package MainTeste;


import com.classes.BO.produtoBO;
import com.classes.DTO.produto;

import Enum.tipos;


public class Main {

	public static void main(String[] args) {

	
		produtoBO ProdutoBO = new produtoBO();
		tipos t = tipos.INT;
		
		produto p1 = new produto(" CODIGO ",t.name(), true , true );
		
		System.out.println(ProdutoBO.adicionarColuna(p1));
	}

}
