package cc.tomgao.demo.springdoc.sys.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@Accessors(chain = true)
@Schema(description = "Sys User Info")
public class User {
    @Schema(description = "primary key id")
    private String id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
