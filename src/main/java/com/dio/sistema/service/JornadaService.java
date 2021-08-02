package com.dio.sistema.service;

import com.dio.sistema.model.JornadaTrabalho;
import com.dio.sistema.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {

        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> findAll() {

        return   jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {

        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteById(Long idJornada) {

         jornadaRepository.deleteById(idJornada);
    }


}
