package com.joao.cursomc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.domain.Cidade;
import com.joao.cursomc.domain.Cliente;
import com.joao.cursomc.domain.Endereco;
import com.joao.cursomc.domain.Estado;
import com.joao.cursomc.domain.ItemPedido;
import com.joao.cursomc.domain.Pagamento;
import com.joao.cursomc.domain.PagamentoComBoleto;
import com.joao.cursomc.domain.PagamentoComCartao;
import com.joao.cursomc.domain.Pedido;
import com.joao.cursomc.domain.Produto;
import com.joao.cursomc.domain.enuns.EstadoPagamento;
import com.joao.cursomc.domain.enuns.TipoCliente;
import com.joao.cursomc.repositories.CategoriaRepositiory;
import com.joao.cursomc.repositories.CidadeRepositiory;
import com.joao.cursomc.repositories.ClienteRepository;
import com.joao.cursomc.repositories.EnderecoRepository;
import com.joao.cursomc.repositories.EstadoRepositiory;
import com.joao.cursomc.repositories.ItemPedidoRepository;
import com.joao.cursomc.repositories.PagamentoRepository;
import com.joao.cursomc.repositories.PedidoRepository;
import com.joao.cursomc.repositories.ProdutoRepositiory;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		

	}
}
