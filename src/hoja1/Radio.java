/**
*@author Cristian Perez Tay 16011
*@author Jose Rodolfo Perez 16056
*@author Christopher Recinos 16005
*/

package hoja1;

public class Radio implements Interface{

private boolean estado;
private double frecuenciaFM;
private int frecuenciaAM;
private double boton1;
private double boton2;
private double boton3;
private double boton4;
private double boton5;
private double boton6;
private double boton7;
private double boton8;
private double boton9;
private double boton10;
private double boton11;
private double boton12;
private int checkfrequence;
//atributos de la clase Radio
public Radio(boolean estado, int frecuenciaAM, double frecuenciaFM, double boton1, double boton2, double boton3, double boton4, double boton5, double boton6, double boton7, double boton8, double boton9, double boton10, double boton11, double boton12){
  this.estado = estado;
  this.frecuenciaFM = frecuenciaFM;
  this.frecuenciaAM = frecuenciaAM;
  this.boton1 = boton1;
  this.boton2 = boton2;
  this.boton3 = boton3;
  this.boton4 = boton4;
  this.boton5 = boton5;
  this.boton6 = boton6;
  this.boton7 = boton7;
  this.boton8 = boton8;
  this.boton9 = boton9;
  this.boton10 = boton10;
  this.boton11 = boton11;
  this.boton12 = boton12;
}
//constructor de la clase

public Radio() {
	// TODO Auto-generated constructor stub
}

public void setEstado(boolean newestado){
  this.estado = newestado;
}

public void setFrecuenciaFM(int newfrecuencia){
  this.frecuenciaFM = newfrecuencia;
}

public void setFrecuenciaAM (int newfrecuencia){
  this.frecuenciaAM = newfrecuencia;
}

public void setBoton1 (double newboton1){
  this.boton1 = newboton1;
}

public void setBoton2 (double newboton2){
  this.boton2 = newboton2;
}

public void setBoton3 (double newboton3){
  this.boton3 = newboton3;
}

public void setBoton4 (double newboton4){
  this.boton4 = newboton4;
}

public void setBoton5 (double newboton5){
  this.boton5 = newboton5;
}

public void setBoton6 (double newboton6){
  this.boton6 = newboton6;
}

public void setBoton7 (double newboton7){
  this.boton7 = newboton7;
}

public void setBoton8 (double newboton8){
  this.boton8 = newboton8;
}

public void setBoton9 (double newboton9){
  this.boton9 = newboton9;
}

public void setBoton10 (double newboton10){
  this.boton10 = newboton10;
}

public void setBoton11 (double newboton11){
  this.boton11 = newboton11;
}

public void setBoton12 (double newboton12){
  this.boton12 = newboton12;
}
//sets de todos los atributos de la clase

public boolean getEstado (){
  return estado;
}

public double getFrecuenciaFM (){
  return frecuenciaFM;
}

public int getFrecuenciaAM(){
  return frecuenciaAM;
}

public double getBoton1 (){
  return boton1;
}

public double getBoton2 (){
  return boton2;
}

public double getBoton3 (){
  return boton3;
}


public double getBoton4 (){
  return boton4;
}

public double getBoton5 (){
  return boton5;
}

public double getBoton6 (){
  return boton6;
}

public double getBoton7 (){
  return boton7;
}

public double getBoton8 (){
  return boton8;
}

public double getBoton9 (){
  return boton9;
}

public double getBoton10 (){
  return boton10;
}

public double getBoton11 (){
  return boton11;
}

public double getBoton12 (){
  return boton12;
}
//gets de toda la clase

@Override
public void estado(){

}

//ay que probar esto porque no se si esta weno

@Override
public void frecuencia(){

}


public void cambiar(boolean a){

}

@Override
public void cambiar(double a){

}

@Override
public float seleccionar (int a){
	int b = 0;
	return b;
	
}
public boolean getFrecuencia(int a){
	if(a==1){
		return true;
	}
	else{
		return false;
	}
}
	
public int checkFrequence(double a){
	 if(a>109.7){
		 return 1;
	 }
	 else{
		 return 2;
	 }
}
	 
public String checkEstado(boolean a){
	if(a == true){
		return "on";
	}
	else{
		return "off";
	}
}
	 




@Override
public void guardar(int a) {
	// TODO Auto-generated method stub
	
}


}
