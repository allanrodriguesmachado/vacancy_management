package br.com.allandev.crud_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
    private UUID uuid;
    private String name;
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] não está valido")
    private String username;
    @Email(message = "O campo [email] deve conter um E-mail válido")
    private String email;
    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;
}
