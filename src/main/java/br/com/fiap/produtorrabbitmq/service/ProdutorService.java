package br.com.fiap.produtorrabbitmq.service;

import br.com.fiap.produtorrabbitmq.model.InfoMensagem;

public interface ProdutorService {

   boolean notificarComentario(InfoMensagem infoMensagem);
}
