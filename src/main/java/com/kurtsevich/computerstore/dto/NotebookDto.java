package com.kurtsevich.computerstore.dto;

import com.kurtsevich.computerstore.entity.enums.ScreenSize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class NotebookDto extends BaseProductDto {
    private ScreenSize screenSize;

}
