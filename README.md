# Spring Boot Kakfa Demo
### Running kakfa
```
docker-compose up
```

### For use api
```
curl -X POST http://localhost:8080/kafka/publish
curl -d "message=publish-message" -X POST http://localhost:8080/kafka/publish
```
