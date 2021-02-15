# spring-webflux-status-code-demo

Small Spring Boot project demonstrating the status code set on the response.

When sending a request as below
```
curl http://localhost:8080/test
```
the returned status code is `418 I'm a teapot`, but the `StatusCodeWebFilter` (line 18) prints out `200 OK`
