package br.com.imed.lista;

import java.util.ArrayList;
import java.util.Arrays;

import javax.jws.Oneway;

public class ListaUsandoPrimitivo {

	private Object[] listaPrimitiva;

	public ListaUsandoPrimitivo(Object[] listaPrimitiva) {
		this.listaPrimitiva = listaPrimitiva;
	}

	public boolean add(Object object) {
		try {
			Object[] oldList = this.listaPrimitiva.clone();
			int oldLength = this.listaPrimitiva.length;
			int newLength = oldLength + 1;
			this.listaPrimitiva = new Object[newLength];
			for (int i = 0; i < oldList.length; i++) {
				listaPrimitiva[i] = oldList[i];
			}
			this.listaPrimitiva[oldLength] = object;

			return listaPrimitiva[oldLength] != null;
		} catch (Exception e) {
			return false;
		}

	}

	public Object size() {
		return listaPrimitiva.length;
	}

	public boolean remove(int indice) {
		try {
			this.listaPrimitiva[indice] = null;
			Object[] clone = listaPrimitiva.clone();
			int oldLength = this.listaPrimitiva.length;
			int newSize = 0;
			this.listaPrimitiva = new Object[oldLength + 1];
			for (Object object2 : clone) {
				if (object2 != null){
					listaPrimitiva[newSize] = object2;
					++newSize;
				}
			}
			return newSize < oldLength;
		} catch (Exception e) {
			return false;
		}
	}
}
