package com.primeiroboot.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code; //evita erros nas possiveis manutenção do código
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code){
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value; //faz uma iteração por todos os enums,se houver algum enum com o código do argumento, retorna tal enum
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
