package com.hydatis.KycmicroserviceCQRS.command.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table

public class DemandeEngagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long ID ;
    private LocalDateTime dateDemande;
    int fraudScore ;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "responsable_id")
    private Responsable responsable;
    @OneToOne
    private Decision decision;
    @OneToOne
    private  AgentPersonnePhysique agentPersonnePhysique;
    @OneToOne
    private  AgentPersonneMorale agentPersonneMorale;


}
