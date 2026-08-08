package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDTO {
    @Schema(
            description = "Account number",
            example = "1234567890"
    )
    @NotEmpty(message = "Account Number can not be a null or empty")
    @Pattern(regexp = "(^|[0-9]{10})", message = "Mobile number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type can not be a null or empty")
    private String accountType;

    @Schema(
            description = "Branch Address"
    )
    @NotEmpty(message = "Branch Address can not be a null or empty")
    private String branchAddress;
}
