package com.Pra03.service;

import com.Pra03.dao.EstadoDao;
import com.Pra03.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceimpl implements EstadoService {

    @Autowired
    EstadoDao estadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstados() {
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.deleteById(estado.getIdPais());
    }
}
