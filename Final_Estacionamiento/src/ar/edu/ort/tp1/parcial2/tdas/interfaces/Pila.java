package ar.edu.ort.tp1.parcial2.tdas.interfaces;

public interface Pila<T> extends Tda {

	void push(T element);

	T pop();

	T peek();

}