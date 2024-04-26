package com;

public abstract class Calculadora {

		private String marca;
		private String color;
		private double precio;
		
		public Calculadora () {}

		public Calculadora(String marca, String color, double precio) {
			super();
			this.marca = marca;
			this.color = color;
			this.precio = precio;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + ", toString()="
					+ super.toString() + "]";
		}
		
		public abstract void sumar (int a, int b, int c);
		
		public abstract void restar (int a, int b, int c);
		
		public abstract void multiplicar (int a, int b, int c);
		
		public abstract void dividir (int a, int b, int c);

		
		
		
		
		
		
	
	}


