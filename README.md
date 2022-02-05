# OrderGeneratorWithGrafana

![example workflow](https://github.com/temkarus0070/OrderGeneratorWithGrafana/actions/workflows/maven.yml/badge.svg)
<br />
Генерация заказов с использованием библиотеки javafaker

## Endpoints:
- GET /actuator​/beans
- GET ​/actuator​/caches
- DELETE /actuator​/caches
- GET /actuator​/caches​/{cache}
- DELETE ​/actuator​/caches​/{cache}
- GET ​/actuator​/conditions
- GET ​/actuator​/configprops
- GET ​/actuator​/configprops​/{prefix}
- GET /actuator​/env
- GET ​/actuator​/env​/{toMatch}
- GET ​/actuator​/health
- GET ​/actuator​/health​/**
- GET /actuator​/heapdump
- GET ​/actuator​/info
- GET /actuator​/loggers
- GET ​/actuator​/loggers​/{name}
- POST ​/actuator​/loggers​/{name}
- GET /actuator​/mappings
- GET /actuator​/metrics
- GET ​/actuator​/metrics​/{requiredMetricName}
- GET /actuator​/prometheus
- GET /actuator​/scheduledtasks
- GET ​/actuator​/threaddump

- GET /order​/generate
## Запуск:

1. Установите docker и docker compose
2. Клонируйте этот репозиторий на свой компьютер
3. Откройте командную строку или терминал и перейдите в каталог с клонированным репозиторием
4. запустите команду `docker-compose up`