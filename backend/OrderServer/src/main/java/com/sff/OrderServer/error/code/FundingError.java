package com.sff.OrderServer.error.code;

import com.sff.OrderServer.error.type.ServiceError;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FundingError implements ServiceError {
    NOT_EXIST_BUCKET(3600, "입력한 유저와 바구니 정보가 존재하지 않습니다.");

    private final int code;
    private final String message;
}
