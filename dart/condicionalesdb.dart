import 'dart:io';

void main() {
  print('Ingrese un número entero');
  int num = int.parse(stdin.readLineSync()!);
  if (num < 0) {
    print('El número que ingresaste es: "Negativo"');
  } else {
    if (num > 0) {
      print('El número que ingresaste es: "Positivo"');
    } else {
      print('El número que ingresaste es: "0"');
    }
  }
}