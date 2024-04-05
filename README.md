# 1. Start server + add new customer
![image](https://github.com/VuLanTuong/resilent4j-spring-boot/assets/96322143/e8333b92-8b70-4082-9f5a-0384b4bdc01f)
# 2. RequestMapping not existed
## This application has no explicit mapping for /error, so you are seeing this as a fallback.
## 2024-04-05T16:17:49.270+07:00  WARN 25880 --- [Customer] [nio-8080-exec-3] .w.s.m.s.DefaultHandlerExceptionResolver : 
## Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Failed to convert value of type 'java.lang.String' to required type 'long'; For input string: "1=sdsfdkfslcdwf"]
![image](https://github.com/VuLanTuong/resilent4j-spring-boot/assets/96322143/7d689978-a6ba-4952-a5ff-2fc99d15cbe5)
# 3. Don't need to restart server, send a new valid request
## Server still works stable
![image](https://github.com/VuLanTuong/resilent4j-spring-boot/assets/96322143/731a438c-7f16-4ef7-8af4-e46fa5017f35)


