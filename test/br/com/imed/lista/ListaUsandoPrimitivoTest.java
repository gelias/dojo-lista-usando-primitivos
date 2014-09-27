package br.com.imed.lista;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaUsandoPrimitivoTest {

	@Test
	public void deveAdicionar_comSucesso_umNovoObjeto_emUmaListaVazia() {
		ListaUsandoPrimitivo lista = criaLista(0);
		boolean adicionado = lista.add(new Object());
		assertTrue(adicionado);
	}
	
	@Test
	public void deveRetornar_falso_quandoAdicionar_umObjeto_invalido(){
		ListaUsandoPrimitivo lista = criaLista(0);
		assertFalse(lista.add(null));
	}
	
	@Test
	public void deveAdicionar_comSucesso_umNovoObjeto_emUmaJaPopulada() {
		ListaUsandoPrimitivo lista = criaLista(1);
		boolean adicionado = lista.add(new Object());
		assertTrue(adicionado);
	}
	
	@Test
	public void deveRemover_comSucesso_oPrimeiroElemento_deUmaLista() {
		ListaUsandoPrimitivo lista = criaLista(1);
		boolean removido = lista.remove(0);
		assertTrue("Deveria ter removido com sucesso o indice da lista",removido);
	}
	
	@Test
	public void deveRemover_comSucesso_oSegundoElemento_deUmaListaDeTres() {
		ListaUsandoPrimitivo lista = criaLista(3);
		boolean removido = lista.remove(1);
		assertEquals(true, removido);
	}
	
	@Test
	public void deveRetornar_totalUmElemento_deUmaListaUm(){
		ListaUsandoPrimitivo lista = criaLista(1);
		assertEquals(1, lista.tamanho());
	}
	
	@Test
	public void deveRetornar_totalZero_deUmaListaVazia(){
		ListaUsandoPrimitivo lista = criaLista(0);
		assertEquals(0, lista.tamanho());
	}
	
	@Test
	public void deveRetornar_true_deUmaListaVazia() {
		ListaUsandoPrimitivo lista = criaLista(0);
		assertTrue("A lista deveria estar vazia.", lista.isEmpty());
	}
	
	public static ListaUsandoPrimitivo criaLista(int size) {
		Object[] listaPrimitiva = new Object[size];
		ListaUsandoPrimitivo lista = new ListaUsandoPrimitivo(listaPrimitiva);
		for (int i = 0; i < size; i++) {
			listaPrimitiva[i]=new Object();
		}
		return lista;
	}

}
