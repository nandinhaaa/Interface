package interfaceDP;

class Main {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println("A �rea do Retangulo: " + a.calculaArea());
		AreaCalculavel a1 = new Circulo (1);
		System.out.println("A �rea do Circulo: " + a1.calculaArea());
	}
}
