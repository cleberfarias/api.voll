package med.voll.api;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
