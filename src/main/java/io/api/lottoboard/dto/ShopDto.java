package io.api.lottoboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ShopDto {

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Response {
        private String name;
        private String location;
        private long firstPrizeCount;
        private long secondPrizeCount;

        public static ShopDto.Response mockOf(int i) {
            return new Response("test", "test location", i, i);
        }
    }
}
