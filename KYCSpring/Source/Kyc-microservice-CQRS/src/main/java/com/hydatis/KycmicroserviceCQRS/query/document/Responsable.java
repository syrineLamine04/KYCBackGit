package com.hydatis.KycmicroserviceCQRS.query.document;

import lombok.*;

import javax.persistence.Column;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Responsable {
    private Long id;

    private String role;
    private String signature;
    private List<demandeEngagement>demandeEngagements;
}
