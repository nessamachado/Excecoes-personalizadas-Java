package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}

//Exception obrigado a tratar as exceções
//RuntimeException não é obrigado a tratar as exceções