package com.hydatis.KycmicroserviceCQRS.command.model;
import lombok.*;

import javax.persistence.*;


@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long ID ;

    private String username ;
    private String password ;
    private String email ;

}


