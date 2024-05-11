package com.customers.management.system.customersmicroservice.interfaceadapters.presenters.dtos;

import com.customers.management.system.customersmicroservice.util.enums.TipoPagamento;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ClienteDto extends Dto implements Serializable {
    @NotEmpty
    @Schema(example = "João das Couves")
    private String nome;

    @NotEmpty
    @Schema(example = "True")
    private boolean ativo;

    @NotEmpty
    @Schema(example = "joaoCouves@provedormail.com")
    private String email;

    @NotEmpty
    @Schema(example = "99999999999")
    private String telefone;

    @NotEmpty
    @Schema(example = "PIX")
    private TipoPagamento tipoPagamentoPreferencial;

    @NotEmpty
    private List<ClienteEnderecoDto> clienteEnderecosDto;

    @NotEmpty
    private List<ClienteDocumentoDto> clienteDocumentosDto;
}
