package rlanza1;

public class Electrodomestico {
private String marca;
private String modelo;
private boolean encendido;
private String error;

//Constructors

public Electrodomestico (String marca, String modelo, boolean encendido, String error)
{
this.marca = marca;
this.modelo = modelo;
this.encendido = encendido;
this.error = error;
}

//Setters
public void SetEncendido (boolean encendido)
{
	this.encendido = encendido;
	
}

public void SetError (String error){
	this.error = error;
}

//Getters

public String getMarca (){
	return this.marca;
}

public String getModelo(){
	return this.modelo;
}

public boolean getEncendido (){
	return this.encendido;
}
public String getError (){
	return this.error;
}
}
