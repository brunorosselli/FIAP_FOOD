package br.com.fiap.fiapfood.core.usecase.restaurante;

import br.com.fiap.fiapfood.core.entity.RestauranteDomain;
import br.com.fiap.fiapfood.core.gateways.RestauranteRepository;
import org.springframework.stereotype.Service;

@Service
public class BuscarRestaurantePorNome {

    private final RestauranteRepository restauranteRepository;

    public BuscarRestaurantePorNome(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public RestauranteDomain call(String nome) {
        return restauranteRepository.buscarPorNome(nome);
    }

}
