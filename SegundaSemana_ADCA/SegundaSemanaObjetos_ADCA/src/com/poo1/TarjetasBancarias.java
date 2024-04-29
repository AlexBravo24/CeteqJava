package com.poo1;

public class TarjetasBancarias {
	
	private String banco;
	private String color;
	private String redDePago;
	private String numeroTarjeta; //pude ocupar Long pero internet me dijo que ocupara string para no hacer operaciones matematicas
							     // supongo para evitar algun tipo de frade.
	public TarjetasBancarias() {
		
	}
								public TarjetasBancarias(String banco, String color, String redDePago,
										String numeroTarjeta) {
									super();
									this.banco = banco;
									this.color = color;
									this.redDePago = redDePago;
									this.numeroTarjeta = numeroTarjeta;
								}
								public String getBanco() {
									return banco;
								}
								public void setBanco(String banco) {
									this.banco = banco;
								}
								public String getColor() {
									return color;
								}
								public void setColor(String color) {
									this.color = color;
								}
								public String getRedDePago() {
									return redDePago;
								}
								public void setRedDePago(String redDePago) {
									this.redDePago = redDePago;
								}
								public String getNumeroTarjeta() {
									return numeroTarjeta;
								}
								public void setNumeroTarjeta(String numeroTarjeta) {
									this.numeroTarjeta = numeroTarjeta;
								}
								@Override
								public String toString() {
									return "TarjetasBancarias [banco=" + banco + ", color=" + color + ", redDePago="
											+ redDePago + ", numeroTarjeta=" + numeroTarjeta + "]";
								}
	

}
