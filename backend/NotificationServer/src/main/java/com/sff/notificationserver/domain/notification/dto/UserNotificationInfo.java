package com.sff.notificationserver.domain.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserNotificationInfo {

    private Long storeId;
    private String storeName;

    private List<Long> recipients;
    private String recipient_type;
    private String content;
    private String url;

}
