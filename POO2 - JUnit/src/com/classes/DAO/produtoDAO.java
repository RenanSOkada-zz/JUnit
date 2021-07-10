package com.classes.DAO;

import com.classes.DTO.produto;

public class produtoDAO {
	
	 public String adicionarColuna( produto p) {
	    	
	    	if(p.isAu() == true && p.isNn() == true) {
	            String sql =  p.getId() + p.getTipo() + " NOT NULL AUTO_INCREMENT," ; 
	            return sql;
	     
	    	}else if(p.isAu() == true && p.isNn() == false) {
	                String sql =  p.getId() + p.getTipo() + " AUTO_INCREMENT, "; 
	                return sql;
	            
	    	}else if(p.isAu() == false && p.isNn() == true) {
	    	        String sql = p.getId() + p.getTipo() + " NOT NULL,"; 
	                return sql;
	       
	    	}else {
	                String sql =  p.getId() + p.getTipo()  + ","; 
	                return sql;
	    	}
	    }

}
