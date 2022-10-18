GET LIST (method GET) https://api-csw-t2009m1.herokuapp.com/api/employee

FIND BY ID (method GET) https://api-csw-t2009m1.herokuapp.com/api/employee/1

SAVE (method POST) https://api-csw-t2009m1.herokuapp.com/api/employee

#### Body:
```json
  {
      "name": "Nguyen Van A",
      "salary": 1000000
   }
```

UPDATE EMPLOYEE (method PUT) https://api-csw-t2009m1.herokuapp.com/api/employee/1

#### Body:
```json
  {
      "name": "Nguyen Van A",
      "salary": 1000000
   }
```
DELETE EMPLOYEE (method DELETE) https://api-csw-t2009m1.herokuapp.com/api/employee/1