package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
@Data
public class CustomerDTO {
    @Schema(
            description = "Name of the customer",
            example = "Pedro"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 3, max = 30, message = "The length of the customer name should be between 3 and 30")
    private String name;

    @Schema(
            description = "Email of the customer",
            example = "pedro@pedro.com"
    )
    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile number of the customer",
            example = "1234567890"
    )
    @Pattern(regexp = "(^|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDTO accountsDTO;
}
