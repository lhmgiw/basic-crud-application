# Basic CRUD Application <img src ="https://www.liquibase.org/wp-content/uploads/2022/03/Liquibase-horizontal-orange.png" align =right width="15%" height="20%"><img src ="https://www.unixmen.com/wp-content/uploads/2017/07/postgresql-logo.png" align =right width="10%" height="10%"><img src ="https://miro.medium.com/max/700/1*-uckV8DOh3l0bCvqZ73zYg.png" align =right width="15%" height="20%">
This is a simple spring boot application that can Create, View, Update and Delete an entity.

## Dependencies used
* Spring Data JPA
* Spring Boot Starter Validation
* Liquibase
* PostgreSQL JDBC Driver
* Lombok
* ModelMapper

## Prerequisites
1. To run this project, you need to installed;
* Java 8
* IDE like InteliJ idea
* pgAdmin
2. Create schema called "library"


## Features
* Customized error messages from external file
* Field level validations

## Sample cURL
* Create

```
curl --location --request POST 'http://localhost:8081/api/v1/books?username=gayan' \
--header 'Content-Type: application/json' \
--data-raw '{
    "code": "00005",
    "name": "sample book 3",
    "price": 88888888.00,
    "author": "gayan",
    "status": "ACTIVE"
}'
```

* View all data
```
curl --location --request GET 'http://localhost:8081/api/v1/books'
```

* View by id
```
curl --location --request GET 'http://localhost:8081/api/v1/books/4'
```

* Edit
```
curl --location --request PUT 'http://localhost:8081/api/v1/books/5?username=gayan_w' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Spring Boot",
    "price": 199.00,
    "author": "gayan wickramarathna",
    "status": "ACTIVE"
}'
```

* Delete
```
curl --location --request DELETE 'http://localhost:8081/api/v1/books/5?username=gayan_w2'
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
