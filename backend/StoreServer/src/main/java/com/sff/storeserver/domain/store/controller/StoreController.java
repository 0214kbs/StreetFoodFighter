package com.sff.storeserver.domain.store.controller;

import com.sff.storeserver.common.aop.UserIdHolder;
import com.sff.storeserver.common.aop.UserIdRequired;
import com.sff.storeserver.common.utils.ApiResult;
import com.sff.storeserver.common.utils.ApiUtils;
import com.sff.storeserver.domain.store.dto.*;
import com.sff.storeserver.domain.store.entity.CategoryType;
import com.sff.storeserver.domain.store.service.StoreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Tag(name = "가게 API", description = "가게 관련 API")
@RestController
@RequestMapping("/api/store-service")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @Operation(summary = "사장 - 가게 등록", description = "사장 회원가입시 가게를 등록합니다.")
    @PostMapping("/stores")
    public ApiResult<String> registerStore(@Valid @RequestBody StoreInfo storeInfo) {
        storeService.createStore(storeInfo);
        return ApiUtils.success("가게 등록 성공");
    }

    @Operation(summary = "사장 - 가게 정보 조회", description = "가게 정보를 조회합니다.")
    @UserIdRequired
    @GetMapping("/store")
    public ApiResult<StoreInfoResponse> getStore(UserIdHolder userIdHolder) {
        StoreInfoResponse storeInfoResponse = storeService.getStore(userIdHolder.getUserId());
        return ApiUtils.success(storeInfoResponse);
    }

    @GetMapping("/stores")
    public ApiResult<List<StoreInfoResponse>> getStoreByStoreId(@RequestParam List<Long> ids) {
        return ApiUtils.success(storeService.getStores(ids));
    }

    @Operation(summary = "손님 - 가게 정보 상세 조회", description = "손님이 가게 정보를 상세 조회합니다.")
    @GetMapping("/stores/{storeId}/detail")
    public ApiResult<StoreDetailResponse> getStoreDetail(@PathVariable Long storeId) {
        StoreDetailResponse storeDetailResponse = storeService.getStoreDetail(storeId);
        return ApiUtils.success(storeDetailResponse);
    }

    @Operation(summary = "사장 - 가게 정보 수정", description = "가게 정보를 수정합니다.")
    @PutMapping("/stores")
    @UserIdRequired
    public ApiResult<String> updateStore(UserIdHolder userIdHolder, @RequestBody StoreUpdateInfo storeUpdateInfo) {
        storeService.updateStore(storeUpdateInfo, userIdHolder.getUserId());
        return ApiUtils.success("가게 정보 수정을 성공했습니다.");
    }

    @Operation(summary = "사장 - 가게 카테고리, 업태 조회", description = "가게 카테고리, 업태를 조회합니다.")
    @GetMapping("/stores/categories")
    @UserIdRequired
    public ApiResult<StoreUpdateCategory> getStoreCategory(UserIdHolder userIdHolder) {
        StoreUpdateCategory storeUpdateCategory = storeService.getStoreCategory(userIdHolder.getUserId());
        return ApiUtils.success(storeUpdateCategory);
    }

    @Operation(summary = "사장 - 가게 카테고리, 업태 수정", description = "가게 카테고리, 업태를 수정합니다.")
    @PutMapping("/stores/categories")
    @UserIdRequired
    public ApiResult<String> updateStoreCategory(UserIdHolder userIdHolder, @RequestBody StoreUpdateCategory storeUpdateCategory) {
        storeService.updateStoreCategory(storeUpdateCategory, userIdHolder.getUserId());
        return ApiUtils.success("가게 카테고리 수정을 성공했습니다.");
    }

    @Operation(summary = "사장 - 사장님 회원 탈퇴", description = "사장님 회원 탈퇴")
    @DeleteMapping("/stores")
    @UserIdRequired
    public ApiResult<String> deleteStore(UserIdHolder userIdHolder) {
        storeService.deleteStore(userIdHolder.getUserId());
        return ApiUtils.success("가게 정보 삭제 완료");
    }

    @Operation(summary = "손님 - 내 근처 가게 조회 성공", description = "내 근처 가게 조회합니다.")
    @GetMapping("/stores/near")
    public ApiResult<List<StoreInfoResponse>> getNearStore(@RequestParam() String region1,
                                                           @RequestParam() String region2,
                                                           @RequestParam() String region3,
                                                           @RequestParam() String region4,
                                                           @RequestParam("categories") List<CategoryType> categories) {
        List<StoreInfoResponse> stores = storeService.getNearStore(region1, region2, region3, region4, categories);
        return ApiUtils.success(stores);
    }

    @Operation(summary = "손님 - 펀딩할 수 있는 깃발 조회", description = "내 근처 깃발 조회합니다.")
    @GetMapping("/flag/near")
    public ApiResult<List<FlagStoreInfoResponse>> getNearFlag(@RequestParam("date") LocalDate date,
                                                              @RequestParam() String region1,
                                                              @RequestParam() String region2,
                                                              @RequestParam() String region3,
                                                              @RequestParam() String region4,
                                                              @RequestParam("categories") List<CategoryType> categories) {
        List<FlagStoreInfoResponse> flags = storeService.getNearFlag(date, region1, region2, region3, region4, categories);
        return ApiUtils.success(flags);
    }

    @Operation(summary = "사장 - 가게 영업 시작", description = "가게 영업을 시작합니다. (깃발 선택 가능)")
    @PostMapping("/store/business")
    @UserIdRequired
    public ApiResult<String> startBusiness(UserIdHolder userIdHolder,
                                           @RequestBody @Valid StoreStartInfo storeStartInfo) {
        storeService.startBusiness(userIdHolder.getUserId(), storeStartInfo);
        return ApiUtils.success("가게 영업 시작");
    }

    @Operation(summary = "사장 - 가게 영업 종료", description = "가게 영업을 종료합니다.")
    @DeleteMapping("/store/business")
    @UserIdRequired
    public ApiResult<String> closeBusiness(UserIdHolder userIdHolder) {
        storeService.closeBusiness(userIdHolder.getUserId());
        return ApiUtils.success("가게 영업 종료");
    }

    @Operation(summary = "사장 - 사장ID 찾기", description = "가게 ID로 사장 ID를 찾습니다.")
    @GetMapping("/store/{storeId}/owner")
    public ApiResult<Long> getOwnerId(@PathVariable Long storeId) {
        Long ownerId = storeService.getOwnerId(storeId);
        return ApiUtils.success(ownerId);
    }

    @Operation(summary = "사장 - 가게 이름 찾기", description = "가게 ID로 가게 이름을 찾습니다.")
    @GetMapping("/store/{storeId}/name")
    public ApiResult<String> getStoreName(@PathVariable Long storeId) {
        String storeName = storeService.getStoreName(storeId);
        return ApiUtils.success(storeName);
    }

    @Operation(summary = "사장 - 가게 아이디 찾기", description = "사장 ID로 가게 아이디를 찾습니다.")
    @GetMapping("/store/storeId/{ownerId}")
    public ApiResult<Long> getStoreIdByOwnerId(@PathVariable Long ownerId) {
        Long storeId = storeService.getStoreIdByOwnerId(ownerId);
        return ApiUtils.success(storeId);
    }
}
