# Тестовое задание
## Установка приложения
Для запуска приложения присутсвует dockerfile и docker-compose.
В терминале нужно создать и запустить контейнер с помощью команд:
```
docker build -t cars-directory .
```
```
docker run -p 80:8080 cars-directory
```
После этих действий сервис можно открыть по адресу
```
http://localhost:8080/cars
```
## Описание архитектуры приложения
Архитектурный стиль - REST.
В приложении есть сущность(entity), репозиторий, сервис, конфигуратор и контроллер.

В сущности Car описана информация по объекту, также геттеры и сеттеры.

В сервисе реализованы методы: вывод списка(в том числе сортировка по разным атрибутам), добавления и удаления автомобиля, также статистические показатели(кол-во записе, дата добавления первой и последней записи)

Контроллер обрабатывает запросы к сервису.

## Дополнительные функции
К приложению также подключен Spring Boot Actuator. С помощью него можно смотреть статистику запросов к сервису:
```
http://localhost:8080/actuator/httptrace
```
Метрики:
```
http://localhost:8080/actuator/metrics
```
Логи:
```
http://localhost:8080/actuator/loggers
```
# TestTask1
