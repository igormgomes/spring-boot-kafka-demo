# Spring Boot Kakfa Demo
### Running application with docker
```
docker-compose up
```

### For use api
```
curl -X POST http://localhost:8080/kafka/publish
curl -d "message=publish-message" -X POST http://localhost:8080/kafka/publish
```
