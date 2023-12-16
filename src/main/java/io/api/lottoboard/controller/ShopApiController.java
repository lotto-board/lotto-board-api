package io.api.lottoboard.controller;

import io.api.lottoboard.dto.ShopDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Getter
@RestController
public class ShopApiController {


    @GetMapping("/shop")
    public List<ShopDto.Response> getShops() {

        return List.of(new ShopDto.Response());
    }
}
