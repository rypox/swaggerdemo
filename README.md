The project was created with https://start.spring.io

## Intention

Use swagger-ui in a spring webflux project.

## Next steps

1. add controller
2. add swagger-ui, access in browser using url http://localhost:7777/swagger-ui.html

![swagger-ui.png](swagger-ui.png)

3. access api-docs at http://localhost:7777/v3/api-docs
4. move swagger-ui to actuator context path http://localhost:7777/actuator/webjars/swagger-ui/index.html, forwarding of /actuator/swagger-ui.html doesn't seem to work  
5. add origin header using CorsWebFilter, api request now contains header
   ```Origin: http://localhost:7778```
6. add security config
