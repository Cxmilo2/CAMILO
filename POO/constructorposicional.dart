class Camisa {
  String? talla;
  String? tienda;
  String? marca;
  int? precio;

  Camisa(String talla, String marca) {
    this.talla = talla;
    this.marca = marca;
    
  }
}

void main() {
  Camisa sueter = Camisa('Adidas', 'M');
  sueter.precio = 10000;
  sueter.tienda = 'Adidas Original';
  print(
      'La marca del sueter es ${sueter.marca},es ${sueter.talla}, lo compré en ${sueter.tienda} y tiene un costo de ${sueter.precio}');
}