package com.hydatis.KycmicroserviceCQRS.query.document;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Client {
    private Long id ;
    private List <demandeEngagement> demandeEngagements;
}
