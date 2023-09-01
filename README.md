<div align="center">
<h1 align="center">
OSHI Web
</h1>
</div>

# OSHI Web

## Introduction

Some Rest API about Native Operating System and Hardware Information.

Packaging based on:

- [oshi](https://github.com/oshi/oshi)
- [hutool-system](https://github.com/dromara/hutool)

## Development Environment

- windows 11
- jdk 1.8
- maven 3.6.0

## Project Structure

```
oshi-web
├── src/main
│   ├── java/com.itplh.oshi
│   │   ├── aop
│   │   ├── controller
│   │   |     ├── HutoolSystemController
│   │   |     └── OshiController
│   │   ├── domain
│   │   └── Application
│   └── resources
│       ├── application.yml
│       └── logback.xml
├── pom.xml
└── README.md
```

## Technology Stack

- [Java:1.8](https://github.com/openjdk/jdk)
- [spring-boot:2.3.4.RELEASE](https://github.com/spring-projects/spring-boot)
- [oshi:6.4.5](https://github.com/oshi/oshi)
- [hutool-system:5.8.21](https://github.com/dromara/hutool)
- [jackson:2.15.2](https://github.com/FasterXML/jackson-databind)
- [fastjson2:2.0.39](https://github.com/alibaba/fastjson2)
- [lombok:1.18.12](https://github.com/projectlombok/lombok)

## Build

```bash
mvn clean package -Dmaven.test.skip=true
```
