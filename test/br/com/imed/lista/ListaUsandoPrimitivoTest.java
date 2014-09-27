package br.com.imed.lista;

import org.junit.Assert;
import org.junit.Test;

public class ListaUsandoPrimitivoTest {

	@Test
	public void deveAdicionar_comSucesso_umNovoObjeto_emUmaListaVazia() {
		Object[] listaPrimitiva = new Object[0];
		ListaUsandoPrimitivo lista = new ListaUsandoPrimitivo(listaPrimitiva);
		boolean adicionado = lista.add(new Object());
		Assert.assertTrue(adicionado);
	}
	
	@Test
	public void deveAdicionar_comSucesso_umNovoObjeto_emUmaJaPopulada() {
		Object[] listaPrimitiva = new Object[1];
		listaPrimitiva[0]=  new Object();
		ListaUsandoPrimitivo lista = new ListaUsandoPrimitivo(listaPrimitiva);
		boolean adicionado = lista.add(new Object());
		Assert.assertTrue(adicionado);
	}
	
	@Test
	public void deveRemover_comSucesso_oPrimeiroElemento_deUmaLista() {
		Object[] listaPrimitiva = new Object[1];
		listaPrimitiva[0] = new Object();
		ListaUsandoPrimitivo lista = new ListaUsandoPrimitivo(listaPrimitiva);
		boolean removido = lista.remove(0);
		Assert.assertEquals(true, removido);
	}
	
	@Test
	public void deveRemover_comSucesso_oSegundoElemento_deUmaListaDeTres() {
		Object[] listaPrimitiva = new Object[3];
		listaPrimitiva[0] = new Object();
		listaPrimitiva[1] = new Object();
		listaPrimitiva[3] = new Object();
		ListaUsandoPrimitivo lista = new ListaUsandoPrimitivo(listaPrimitiva);
		boolean removido = lista.remove(1);
		Assert.assertEquals(true, removido);
	}

}
