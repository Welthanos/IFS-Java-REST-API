package br.edu.ifs.academico.rest.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class ItensPedidoUpdateForm {

    @NotEmpty
    @NotNull(message = "A quantidade não pode ser nula.")
    private Integer quantidade;
}
