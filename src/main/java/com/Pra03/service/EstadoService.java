package com.Pra03.service;

import com.Pra03.domain.Estado;
import java.util.List;

public interface EstadoService {

    public List<Estado> getEstados(); //obtener todos los clientes

    public Estado getEstado(Estado estado); //un cliente en especifico

    public void save(Estado estado); //insertar nuevo registro o modificar (si viene el id cliente o no)

    public void delete(Estado estado); //eliminars
}
