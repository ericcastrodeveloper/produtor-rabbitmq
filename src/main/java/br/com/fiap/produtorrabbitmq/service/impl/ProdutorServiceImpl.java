package br.com.fiap.produtorrabbitmq.service.impl;

import br.com.fiap.produtorrabbitmq.model.InfoMensagem;
import br.com.fiap.produtorrabbitmq.service.ProdutorService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProdutorServiceImpl implements ProdutorService {

    private final RabbitTemplate rabbitTemplate;

    public ProdutorServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public boolean notificarComentario(InfoMensagem infoMensagem) {
        System.out.println("Enviando mensagem");
        rabbitTemplate.convertAndSend("fiap.scj.mensagens", infoMensagem);
        return true;
    }

}
