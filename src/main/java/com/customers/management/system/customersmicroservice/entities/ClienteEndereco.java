package com.customers.management.system.customersmicroservice.entities;

import com.customers.management.system.customersmicroservice.util.enums.TipoEndereco;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="clienteEndereco")
public class ClienteEndereco implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column
    private TipoEndereco tipoEndereco;

    @Column
    private String logradouro;

    @Column
    private String numero;

    @Column
    private String bairro;

    @Column
    private String cidade;

    @Column
    private String estado;

    @Column
    private String complemento;

    @Column
    private String cep;

}