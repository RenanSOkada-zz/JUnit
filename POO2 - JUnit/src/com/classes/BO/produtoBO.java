package com.classes.BO;

import com.classes.DAO.produtoDAO;
import com.classes.DTO.produto;

public class produtoBO {
	public String adicionarColuna(produto p) {
		produtoDAO pDAO = new produtoDAO();
		return pDAO.adicionarColuna(p);
	}

}
