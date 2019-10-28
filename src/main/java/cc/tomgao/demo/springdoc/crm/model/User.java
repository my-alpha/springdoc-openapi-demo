package cc.tomgao.demo.springdoc.crm.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@Accessors(chain = true)
@Schema(description = "CRM User Info")
public class User {
    @Schema(description = "primary key id")
    private String id;

    @Schema(description = "user login account")
    @NotBlank
    private String username;

    @Schema(description = "user login password")
    @NotBlank
    private String password;

    @Schema(description = "user login type")
    @NotBlank
    private String type;
}
