package com.hydatis.KycmicroserviceCQRS.query.document;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@org.springframework.data.mongodb.core.mapping.Document
public class Utilisateur {
    private String username;
    private String password;
    private String email;
    private String role;
    private Client client;
    private Responsable responsable;

}
