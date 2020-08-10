package br.com.fiap.produtorrabbitmq.controller;

import br.com.fiap.produtorrabbitmq.model.InfoMensagem;
import br.com.fiap.produtorrabbitmq.service.ProdutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtor")
public class ProdutorController {

    private ProdutorService produtorService;

    public ProdutorController(ProdutorService produtorService) {
        this.produtorService = produtorService;
    }

    @PostMapping
    public ResponseEntity<String> notificarEmail(@RequestBody InfoMensagem infoMensagem){
        produtorService.notificarComentario(infoMensagem);
        return ResponseEntity.status(200).body("Mensagem enviada!");
    }
}
