package com.sff.OrderServer.funding.entity;


import com.sff.OrderServer.bucket.entity.Bucket;
import com.sff.OrderServer.funding.dto.FundingCreateRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Funding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fundingId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUCKET_ID")
    private Bucket bucket;

    @Column(nullable = false)
    private Long storeId;

    @Column(nullable = false)
    private Long flagId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private FundingState fundingState = FundingState.PAYMENT_IN_PROGRESS;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private String requirement;

    public Funding(Bucket bucket, FundingCreateRequest fundingCreateRequest, Long userId){
        this.bucket = bucket;
        this.storeId = fundingCreateRequest.getStoreId();
        this.flagId = fundingCreateRequest.getFlagId();
        this.userId = userId;
        this.requirement = fundingCreateRequest.getRequirement();
        this.fundingState = FundingState.PAYMENT_IN_PROGRESS;
    }

    public void updateState(FundingState fundingState){
        this.fundingState = fundingState;
    }
}
