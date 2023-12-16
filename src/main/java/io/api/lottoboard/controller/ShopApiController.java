package io.api.lottoboard.controller;

import io.api.lottoboard.dto.ShopDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RequiredArgsConstructor
@Getter
@RestController
public class ShopApiController {


    @GetMapping("/shop")
    public List<ShopDto.Response> getShops(Pageable pageable) {
        return IntStream.range(0, pageable.getPageSize())
                .mapToObj(ShopDto.Response::mockOf)
                .collect(Collectors.toList());
    }
}
