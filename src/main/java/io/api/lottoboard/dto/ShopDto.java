package io.api.lottoboard.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class ShopDto {

    @NoArgsConstructor
    @Getter
    public static class Response {
        private String name;
        private String location;
        private Long firstPrizeCount;
        private Long secondPrizeCount;
    }
}
