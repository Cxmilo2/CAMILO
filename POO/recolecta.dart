import 'dart:convert';

class Colaborador{
  String? nombreCompleto;
  int? tipoColaborador;
  double? aporte;

  Colaborador(String jsonString){
    Map<String, dynamic> map = jsonDecode(jsonString);
    this.nombreCompleto = map["nombreCompleto"];
    this.tipoColaborador = map["tipoColaborad"];
    this.aporte = map["aporte"];
    
  }
}
void main(){
  String jsonString = '{"nombreCompleto": "Camilo Alejandro Cassiani Alzate","tipoColaborador": 5,"aporte": 500.0}';
  Colaborador colaborador = Colaborador(jsonString);

  print(colaborador.aporte);
}
