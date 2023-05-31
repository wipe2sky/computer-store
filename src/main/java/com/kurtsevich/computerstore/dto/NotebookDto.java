package com.kurtsevich.computerstore.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class NotebookDto extends BaseProductDto {
    @NotNull(message = "Screen size number name is required")
    private Integer screenSize;

}
