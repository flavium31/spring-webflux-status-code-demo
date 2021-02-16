package com.maersk.responsecodedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class StatusCodeWebFilter implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange,
                             WebFilterChain webFilterChain) {
        return webFilterChain.filter(serverWebExchange)
                .doOnTerminate(() -> log.info("Response code: {}", serverWebExchange.getResponse().getStatusCode().value()));
    }
}